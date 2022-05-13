package io.homework_8.anjela_melqonyan.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelReader {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream
               ("src/main/java/io/homework_8/anjela_melqonyan/excel/excel.xlsx");

        Workbook wb = new XSSFWorkbook(file);

                System.out.println(getCellText(wb.getSheetAt(1).getRow(6).getCell(5)));
            }


        public static String getCellText(Cell cell) {
        String result = null;
            switch (cell.getCellType()) {
                case STRING:
                    result = cell.getRichStringCellValue().getString();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        result = String.valueOf(cell.getDateCellValue());
                    } else {
                        result = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    result = String.valueOf(cell.getBooleanCellValue());
                    break;
                case FORMULA:
                    result = cell.getCellFormula();
                    break;
            }


            return result;
        }
}

