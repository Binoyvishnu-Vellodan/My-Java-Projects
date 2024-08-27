import org.example.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.Map;

public class ExcelRunner {
    public static void main(String args[]) throws IOException {
        String filepath="C:\\Users\\rkobinoyvishnu\\IdeaProjects\\Java\\src\\test\\Docs\\Data.xlsx";
        try {
            Map<String, String> rowData = ExcelUtils.getRawDataAsMap(filepath,"Sheet1",2);
            String username = rowData.get("Name");
            String mark = rowData.get("Mark");
            System.out.println(username);
            System.out.println(mark);
           } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        ExcelUtils excelUtils=new ExcelUtils(filepath,"Sheet1");
    }
}
