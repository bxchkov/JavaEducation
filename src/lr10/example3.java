package lr10;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class example3 {

    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("type", "book");
        book1.put("title", "Книга 1");
        book1.put("author", "Автор 1");
        book1.put("year", "1855");

        JSONObject book2 = new JSONObject();
        book2.put("type", "book");
        book2.put("title", "Книга 2");
        book2.put("author", "Автор 2");
        book2.put("year", "1866");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter out = new FileWriter(".\\example.json")) {
            out.write(library.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Json-файл создан");
    }

}
