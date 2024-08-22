package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataReader {
    public static Map<String, Map<String, String>> getTestData(String excelFilePath, String csvFilePath) throws IOException, CsvException {
            Map<String, Map<String, String>> testData = readExcelFile(excelFilePath);
            Map<String, String> locatorData = readCSVFile(csvFilePath);
            for (String testCase : testData.keySet()) {
                testData.get(testCase).putAll(locatorData);
            }
        return testData;
    }

    private static Map<String, Map<String, String>> readExcelFile(String filePath) throws IOException {
        Map<String, Map<String, String>> testData = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                String testCaseNumber = row.getCell(0).getStringCellValue();
                Map<String, String> dataMap = new HashMap<>();

                for (Cell cell : row) {
                    dataMap.put(sheet.getRow(0).getCell(cell.getColumnIndex()).getStringCellValue(), cell.toString());
                }

                testData.put(testCaseNumber, dataMap);
            }
        }

        return testData;
    }

    private static Map<String, String> readCSVFile(String filePath) throws IOException, CsvException {
        Map<String, String> xpathData = new HashMap<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> rows = csvReader.readAll();

            for (String[] row : rows) {
                if (row.length > 0) {
                    String[] keyValue = row[0].split("=", 2);
                    if (keyValue.length == 2) {
                        xpathData.put(keyValue[0], keyValue[1]);
                    }
                }
            }
        }

        return xpathData;
    }
}
