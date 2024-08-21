import org.example.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Map;

public class ExcelRunner {
    public static void main(String args[]) throws IOException {
//        WebDriver driver= new ChromeDriver();
        ExcelUtils excelUtils= new ExcelUtils("C:\\Users\\rkobinoyvishnu\\IdeaProjects\\Java\\src\\test\\Docs\\Data.xlsx", "Sheet1");
        Map<String,String> rowData= excelUtils.getRawDataAsMap(1);
        String username = rowData.get("Name");
        String mark = rowData.get("Mark");
        System.out.println(username);
        System.out.println(mark);
    }
}
