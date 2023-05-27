package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class example6 {

    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://urfu.ru/ru/").get();

            Elements newsParent = doc.select
                    ("body > .site > .header > .for-main-menu > .main-menu-wrap > .main-menu > .main-menu-item > a");

            for (int i = 0; i < newsParent.size(); i++) {
                List<Node> elem = newsParent.get(i).childNodes();
                System.out.println(i+1 + " элемент шапки: " + elem);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
