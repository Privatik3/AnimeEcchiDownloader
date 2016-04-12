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
}