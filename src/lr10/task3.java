package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class task3 {

    private static final String FILE_NAME = "src\\lr10\\task3Output.txt";
    //private static final int MAX_RETRIES = 3;

    public static void main(String[] args) throws IOException {

        // Получение html-кода страницы
        Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

        // Извлечение элементов
        Elements newsParent = doc.select
                ("body > table > tbody > tr > td > div > table > " +
                          "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                          "tr > td:nth-child(1)");

        // Вывод последних 10 новостей в консоль
        for (int i = 3; i < 20; i++) {
            if (!(i % 2 == 0)) {
                List<Node> nodes = newsParent.get(0).childNodes();
                System.out.println("Тема : " +
                        ((Element) nodes.get(i))
                                .getElementsByClass("blocktitle")
                                .get(0).childNodes().get(0));

                System.out.println("Дата : " +
                        ((Element) nodes.get(i))
                                .getElementsByClass("blockdate")
                                .get(0).childNodes().get(0) + "\n");
            }
        }

        // Запись новостей в файл
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    String topic = ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString();
                    String date = ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString();
                    String newsItem = "Topic: " + topic + "\n" +
                            "Date: " + date + "\n\n";
                    writer.write(newsItem);
                    System.out.println(newsItem);
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to write to file " + FILE_NAME + ": " + e.getMessage());
        }
    }

}
