package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("name", "книга1");
        book1.put("year", "2000");

        JSONObject book2 = new JSONObject();
        book2.put("name", "книга2");
        book2.put("year", "2001");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter out = new FileWriter("src/lr10/task2Output.json")) {
            out.write(library.toString());
            System.out.println("Json-файл успешно создан\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("1 - добавить новую книгу в файл");
        System.out.println("2 - поиск книги по названию");
        System.out.println("3 - удалить книгу по названию");
        System.out.println("0 - выход\n");

        int next = scanner.nextInt();

        switch (next) {
            case 1 -> addNewBook();
            case 2 -> searchBookByName();
            case 3 -> deleteBook();
            case 0 -> {
                scanner.close();
                System.exit(0);
            }
            default -> System.out.println("Неверный выбор, повторите попытку");
        }

    }

    public static void addNewBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги: ");
            String name = scanner.nextLine();
            System.out.println("Введите дату выхода книги: ");
            int year = scanner.nextInt();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/task2Output.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            JSONObject newBook = new JSONObject();
            newBook.put("name", name);
            newBook.put("year", year);
            jsonArray.add(newBook);

            jsonObject.put("books", jsonArray);

            FileWriter fileWriter = new FileWriter("src/lr10/task2Output.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Добавлена новая книга");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchBookByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String name = scanner.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/task2Output.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Object mov = jsonObject.get("books");

            if (mov instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) mov;
                boolean found = false;
                for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    if (book.get("name").equals(name)) {
                        System.out.println("Книга: " + book.get("name"));
                        System.out.println("Дата выхода: " + book.get("year"));
                        found = true;
                    }
                }
                if (!found)
                    System.out.println("Такой книги нет в файле");
            } else
                System.out.println("Введено неверное значение");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги для удаления: ");
            String name = scanner.nextLine();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/task2Output.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean found = false;
            Iterator<Object> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (book.get("name").equals(name)) {
                    iterator.remove();
                    found = true;
                    break;
                }
            }
            if (found) {
                jsonObject.put("books", jsonArray);
                FileWriter fileWriter = new FileWriter("src/lr10/task2Output.json");
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
                fileWriter.close();
                System.out.println("Книга удалена");
            } else
                System.out.println("Такой книги нет в файле");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
