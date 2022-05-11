package io.homework_8.arevik.excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

class ReadExcelFileDemo {
    public static void main(String args[]) {
        final String PATH   = "src/main/java/io/homework_8/arevik/excel/excel.xlsx";


        try {
            FileInputStream file = new FileInputStream(PATH);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            String sheetFirst = workbook.getSheetName(0);
            String sheetSecond = workbook.getSheetName(1);
            XSSFSheet sheets = workbook.getSheetAt(0);
            System.out.println("The first sheet's name is " + sheetFirst);
            System.out.println("The second sheet's name is " + sheetSecond);
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

            XSSFRow row = sheets.getRow(9);
            XSSFCell cell = row.getCell(2);
            XSSFCell lastCell = cell.getRow().getCell(2);
            String k = lastCell.getRawValue();


            System.out.println(cell);
            System.out.println(lastCell);
            System.out.println(k);
            Header header = sheets.getHeader();
            System.out.println(header.getCenter());
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
