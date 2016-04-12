import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public void parseTagImg(String body) {

        String[] allDivImage = body.split("class=\"image");
        for (String bodyDiv : allDivImage) {
            int startUrlIndex = bodyDiv.indexOf("img src=");
            int endUrlIndex = bodyDiv.indexOf("jpeg\" width");

            if (endUrlIndex != -1)
                System.out.println(bodyDiv.substring(startUrlIndex + 9, endUrlIndex + 4));
        }
    }

    public List<String> selectTag(String body, String query) {
        List<String> allTags = new LinkedList<String>();
        // Пиши свой код ниже


        //allTags = testParse(body, query); // Тестовый метод для проверки результата
        return allTags;
    }

    private List<String> testParse(String body, String query) {
        Document doc = Jsoup.parse(body);
        List<String> allTags = new LinkedList<String>();

        for (Element element : doc.select(query)) {
            allTags.add(element.toString());
        }

        return allTags;
    }
}