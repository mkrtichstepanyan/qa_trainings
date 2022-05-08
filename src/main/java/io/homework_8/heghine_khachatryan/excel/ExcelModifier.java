package io.homework_8.heghine_khachatryan.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public final class ExcelModifier {

    private ExcelModifier() {
    }

    public static void removeSheetFromExcel(String path, int sheetNumber) {
        try (FileInputStream fin = new FileInputStream(path); Workbook workbook = new XSSFWorkbook(fin);
             FileOutputStream fout = new FileOutputStream(path)) {
            checkSheetNumber(workbook, sheetNumber);
            workbook.removeSheetAt(sheetNumber);
            System.out.println(sheetNumber + " sheet was removed successfully");
            workbook.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeRowFromExcel(String path, int sheetNumber, int rowNumber) {
        try (FileInputStream fin = new FileInputStream(path); Workbook workbook = new XSSFWorkbook(fin);
             FileOutputStream fout = new FileOutputStream(path)) {
            checkSheetNumber(workbook, sheetNumber);
            Sheet sheetAt = workbook.getSheetAt(sheetNumber);
            if (sheetAt.getRow(rowNumber) == null) {
                System.out.println("Empty row");
                sheetAt.createRow(rowNumber);
            }
            sheetAt.removeRow(sheetAt.getRow(rowNumber));
            System.out.println(rowNumber + " row was removed successfully");
            workbook.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeCellValueFromExcel(String path, int sheetNumber, int rowNumber, int cellNumber) {
        try (FileInputStream fin = new FileInputStream(path); Workbook workbook = new XSSFWorkbook(fin);
             FileOutputStream fout = new FileOutputStream(path)) {
            checkSheetNumber(workbook, sheetNumber);
            Sheet sheetAt = workbook.getSheetAt(sheetNumber);
            if (sheetAt.getRow(rowNumber) == null) {
                System.out.println(rowNumber + " is an empty row");
                sheetAt.createRow(rowNumber).createCell(cellNumber);
            }
            sheetAt.getRow(rowNumber).removeCell(sheetAt.getRow(rowNumber).getCell(cellNumber));
            System.out.println(cellNumber + " cell was removed successfully");
            workbook.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void updateCellValue(String path, int sheetNumber, int rowNumber, int cellNumber, T cellValue) {
        try (FileInputStream fin = new FileInputStream(path); Workbook workbook = new XSSFWorkbook(fin);
             FileOutputStream fout = new FileOutputStream(path)) {
            checkSheetNumber(workbook, sheetNumber);
            Cell cell;
            if (workbook.getSheetAt(sheetNumber).getRow(rowNumber) == null) {
                System.out.println("Created new row - RowNumber " + rowNumber);
                cell = workbook.getSheetAt(sheetNumber).createRow(rowNumber).createCell(cellNumber);
            } else {
                if (workbook.getSheetAt(sheetNumber).getRow(rowNumber).getCell(cellNumber) == null) {
                    System.out.println("In the given row was created a new cell - CellNumber " + cellNumber);
                    cell = workbook.getSheetAt(sheetNumber).getRow(rowNumber).createCell(cellNumber);
                } else {
                    cell = workbook.getSheetAt(sheetNumber).getRow(rowNumber).getCell(cellNumber);
                    System.out.println("Existed cell in an existed row was modified. Old value is "
                            + cell.getRichStringCellValue());
                }
            }
            switch (cell.getCellType()) {
                case BOOLEAN:
                    cell.setCellValue((Boolean) cellValue);
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cell.setCellValue((LocalDate) cellValue);
                    } else {
                        cell.setCellValue((Integer) cellValue);
                    }
                    break;
                default:
                    cell.setCellValue(cellValue + "");
            }
            workbook.write(fout);
            System.out.println("File was modified successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkSheetNumber(Workbook workbook, int sheetNumber) {
        int numberOfSheets = workbook.getNumberOfSheets() - 1;
        if (sheetNumber > numberOfSheets) {
            throw new IllegalArgumentException("Number of sheets in the file is in range from 0 to " + numberOfSheets);
        }
    }
}
