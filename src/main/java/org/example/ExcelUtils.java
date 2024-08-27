package org.example;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtils {
    private static Workbook workbook;
    private static Sheet sheet;
//    public ExcelUtils(String filepath,String sheetname)throws IOException{
//        FileInputStream fis= new FileInputStream(filepath);
//        workbook= new XSSFWorkbook(fis);
//        sheet=workbook.getSheet(sheetname);
//    }
    public static Map<String, String> getRawDataAsMap(String filepath,String sheetname,int rowNum) throws IOException {
        Map<String, String> datamap= new HashMap<>();
        FileInputStream fis= new FileInputStream(filepath);
        workbook= new XSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetname);
        Row headerRow= sheet.getRow(0);
        Row dataRow= sheet.getRow(rowNum);

        int colCount= headerRow.getLastCellNum();
        for(int i=0;i<colCount;i++){
        String key= headerRow.getCell(i).toString();
        String value=dataRow.getCell(i).toString();
        datamap.put(key,value);
        }
        return datamap;
    }
}
