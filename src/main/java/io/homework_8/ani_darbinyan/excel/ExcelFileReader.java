package io.homework_8.ani_darbinyan.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReader {
    private static Workbook workbook;

    public ExcelFileReader(String filepath){
        try {
            FileInputStream file = new FileInputStream(new File(filepath));
            workbook = new XSSFWorkbook(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataBySheetName(String name){
            Sheet sheet = workbook.getSheet(name);

            for(Row row : sheet){
                for (Cell cell : row){
                    switch (cell.getCellType()){
                        case STRING :
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(cell.getDateCellValue() + "\t\t\t");
                            } else {
                                System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            }
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t\t\t");
                            break;
                        case FORMULA:
                            System.out.print(cell.getCellFormula() + "\t\t\t");
                            break;
                        case BLANK:
                            break;
                    }
                }
                System.out.println("-");
            }
    }
}
