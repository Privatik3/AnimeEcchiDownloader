import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("http://anime.reactor.cc/tag/ecchi/best/1").get();
        Elements newsHeadlines = doc.select(".blogs.super li");

        for (Element element: newsHeadlines) {
            System.out.println(element.select("strong").text());
        }
    }
}
