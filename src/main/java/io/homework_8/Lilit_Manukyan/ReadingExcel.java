package io.homework_8.Lilit_Manukyan;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcel {
    public static void main(String[] args) {

        File excelFile = new File("src/main/java/io/homework_8/Lilit_Manukyan/excel/excel.xlsx");
        try {
            FileInputStream fileInputStream = new FileInputStream(excelFile);
            XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet1 = wb.getSheet("DEV");
            XSSFSheet sheet2 = wb.getSheet("QAT");
            System.out.println(sheet1.getRow(1).getCell(1).getStringCellValue());
            System.out.println(sheet1.getRow(3).getCell(0).getStringCellValue());
            System.out.println(sheet2.getRow(3).getCell(0).getStringCellValue());
            int rowCount = sheet1.getLastRowNum() - sheet1.getFirstRowNum();
            System.out.println("row count:" + rowCount);
            for (int i = 0; i <= rowCount; i++) {
                int cellcount = sheet1.getRow(i).getLastCellNum();
                for (int j = 0; j < cellcount; j++) {
                    System.out.print(sheet1.getRow(i).getCell(j).getStringCellValue().toString() + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
