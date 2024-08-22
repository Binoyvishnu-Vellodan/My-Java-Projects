import com.opencsv.exceptions.CsvException;
import org.example.DataReader;

import java.io.IOException;
import java.util.Map;

public class runner {

public static void main(String args[]) {
    String excelFilePath = "C:\\Users\\rkobinoyvishnu\\IdeaProjects\\Java\\src\\test\\Docs\\Data.xlsx";
    String csvFilePath = "C:\\Users\\rkobinoyvishnu\\IdeaProjects\\Java\\src\\test\\Docs\\Locator.csv";
    try {
        Map<String, Map<String, String>> testData = DataReader.getTestData(excelFilePath, csvFilePath);
        String testCasenumber = "TC01";
        if (testData.containsKey(testCasenumber)) {
            System.out.println("Test Data for " + testCasenumber + ": " + testData.get(testCasenumber));
        } else {
//                System.out.println("Test case " + testCaseNumber + " not found.");
//            }
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (CsvException e) {
        throw new RuntimeException(e);
    }
}
}