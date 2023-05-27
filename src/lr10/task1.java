package lr10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("books");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("книга1"));
            book1.appendChild(name1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("2000"));
            book1.appendChild(year1);

            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("книга2"));
            book2.appendChild(name2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("2001"));
            book2.appendChild(year2);

            // Запись xml-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lr10/task1Output.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан\n");

        } catch (Exception pce) {
            pce.printStackTrace();
        }

        System.out.println("1 - добавить новую книгу в файл");
        System.out.println("2 - поиск книги по названию");
        System.out.println("3 - поиск книги по дате выхода");
        System.out.println("4 - удалить книгу по названию");
        System.out.println("0 - выход\n");

        int next = scanner.nextInt();

        switch (next) {
            case 0 -> {
                scanner.close();
                System.exit(0);
            }
            case 1 -> addNewBook();
            case 2 -> searchBookByName();
            case 3 -> searchBookByYear();
            case 4 -> deleteBook();
            default -> System.out.println("Неверный выбор, повторите попытку");
        }
    }

    private static void addNewBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги:");
        String name = scanner.nextLine();

        System.out.println("Введите год выхода книги:");
        int year = scanner.nextInt();

        try {
            File inputFile = new File("src/lr10/task1Output.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);


            Element rootElement = doc.getDocumentElement();

            Element newBook = doc.createElement("book");

            Element nameElement = doc.createElement("name");
            nameElement.setTextContent(name);
            newBook.appendChild(nameElement);

            Element yearElement = doc.createElement("year");
            yearElement.setTextContent(Integer.toString(year));
            newBook.appendChild(yearElement);

            rootElement.appendChild(newBook);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);

            System.out.println("Книга добавлена");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void searchBookByName() throws ParserConfigurationException, IOException, SAXException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Название книги: ");
        String name = scanner.nextLine();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File("src/lr10/task1Output.xml"));
        doc.getDocumentElement().normalize();

        NodeList books = doc.getElementsByTagName("book");
        List<Element> filterBooks = new ArrayList<>();

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            if (book.getElementsByTagName("name").item(0).getTextContent().equalsIgnoreCase(name)) {
                filterBooks.add(book);
            }
        }

        if (filterBooks.size() == 0)
            System.out.println("Нет книги с таким названием");
        else {
            System.out.println("Книги " + name + ":");
            for (Element book : filterBooks) {
                System.out.println("Название: " + book.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Дата выхода: " + book.getElementsByTagName("year").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void searchBookByYear() throws ParserConfigurationException, IOException, SAXException {
        System.out.print("Введите дату выхода книги: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File("src/lr10/task1Output.xml"));
        doc.getDocumentElement().normalize();
        NodeList books = doc.getElementsByTagName("book");
        List<Element> filterOfBooks = new ArrayList<>();
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            int yearOfBook = Integer.parseInt(book.getElementsByTagName("year").item(0).getTextContent());
            if (yearOfBook == year)
                filterOfBooks.add(book);
        }
        if (filterOfBooks.size() == 0)
            System.out.println("Нет книги с такой датой выпуска");
        else {
            System.out.println("Книги в " + year + " году: ");
            for (Element book : filterOfBooks) {
                String name = book.getElementsByTagName("name").item(0).getTextContent();
                String year1 = book.getElementsByTagName("year").item(0).getTextContent();
                System.out.println(name + ", " + year1 + " года выпуска");
            }
        }
    }

    private static void deleteBook() throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги, которую необходимо удалить:");
        String name = scanner.nextLine();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File("src/lr10/task1Output.xml"));
        doc.getDocumentElement().normalize();

        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Node book = books.item(i);
            if (book.getNodeType() == Node.ELEMENT_NODE) {
                Element bookElement = (Element) book;
                String name1 = bookElement.getElementsByTagName("name").item(0).getTextContent();
                if (name1.equals(name)) {
                    book.getParentNode().removeChild(book);
                    System.out.println("Книга " + name + " удалена");
                    saveChanges(doc);
                    return;
                }
            }
        }
        System.out.println("Книга " + name + " не найдена");
    }

    private static void saveChanges(Document document) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/lr10/task1Output.xml"));
            transformer.transform(source, result);
        } catch (TransformerException e) {
            System.out.println("Ошибка сохранения  " + ": " + e.getMessage());
        }
    }

}
