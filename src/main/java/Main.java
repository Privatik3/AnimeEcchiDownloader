import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/EcchiPage1.html");
        BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));

        String allBodyHtml = "";
        String newLine;
        while ((newLine = br.readLine()) != null) {
            allBodyHtml += newLine;
        }

        Solution solution = new Solution();
        //solution.parseTagImg(allBodyHtml);
        for (String tag :  solution.selectTag(allBodyHtml, "li"))
            System.out.println(tag);

    }
}
