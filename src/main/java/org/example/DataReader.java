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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataReader {
    public static Map<String, Map<String, String>> getTestData(String excelFilePath, String csvFilePath) throws IOException, CsvException {
        Map<String, Map<String, String>> testData = readExcelFile(excelFilePath);
        Map<String, String> locatorData = readCSVFile(csvFilePath);
        // Create a new map to store the final ordered data
        Map<String, Map<String, String>> orderedTestData = new LinkedHashMap<>();

            for (String testCase : testData.keySet()) {
                Map<String,String> mergedData= new LinkedHashMap<>(locatorData);
                mergedData.putAll(testData.get(testCase));
                orderedTestData.put(testCase, mergedData);
            }
        return orderedTestData;
    }

    private static Map<String, Map<String, String>> readExcelFile(String filePath) throws IOException {
        HashMap<String, Map<String, String>> testData = new LinkedHashMap<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                String testCaseNumber = row.getCell(0).getStringCellValue();
                HashMap<String, String> dataMap = new LinkedHashMap<>();

                for (Cell cell : row) {
                    dataMap.put(sheet.getRow(0).getCell(cell.getColumnIndex()).getStringCellValue(), cell.toString());
                }

                testData.put(testCaseNumber, dataMap);
            }
        }

        return testData;
    }

    private static Map<String, String> readCSVFile(String filePath) throws IOException, CsvException {
        HashMap<String, String> xpathData = new LinkedHashMap<>();

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
