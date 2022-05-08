package io.homework_8.heghine_khachatryan.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public final class ExcelReader {

    private ExcelReader() {

    }

    public static void readFromExcel(String path, int sheetNumber) {
        try (FileInputStream fin = new FileInputStream(path); Workbook workbook = new XSSFWorkbook(fin)) {
            int numberOfSheets = workbook.getNumberOfSheets() - 1;
            if (sheetNumber > numberOfSheets) {
                throw new IllegalArgumentException("Number of sheets in the file is in range from 0 to " + numberOfSheets);
            }
            Sheet sheet = workbook.getSheetAt(sheetNumber);
            for (Row rows : sheet) {
                System.out.println();
                for (Cell cell : rows) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.printf("|%30S |", cell.getRichStringCellValue());
                            break;
                        case BOOLEAN:
                            System.out.printf("|%30S |", cell.getBooleanCellValue());
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.printf("|%30tY |", cell.getDateCellValue());
                            } else {
                                System.out.printf("|%30s", cell.getNumericCellValue());
                            }
                            break;
                        case FORMULA:
                            System.out.printf("|%30s", cell.getCellFormula());
                            break;
                        case BLANK:
                        case _NONE:
                        case ERROR:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
