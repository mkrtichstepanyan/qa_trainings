package io.homework_8.heghine_khachatryan.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class ExcelWriter {

    private ExcelWriter() {

    }

    public static void writeInExcel(String path, List<QAStudents> QAStudentsList) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("AQA Students");
        Sheet sheet1 = workbook.createSheet("Sheet 1");
        Sheet sheet2 = workbook.createSheet("Sheet 2");
        Sheet sheet3 = workbook.createSheet("Sheet 3");
        Row[] rows = new Row[5];
        for (int i = 0; i < 5; i++) {
            rows[i] = sheet.createRow(i);
        }
        int cellCount = 0;
        for (QAStudents aqaStudents : QAStudentsList) {
            rows[0].createCell(cellCount).setCellValue(aqaStudents.getName());
            rows[1].createCell(cellCount).setCellValue(aqaStudents.getSurname());
            rows[2].createCell(cellCount).setCellValue(aqaStudents.getGender());
            rows[3].createCell(cellCount).setCellValue(aqaStudents.getAge());
            rows[4].createCell(cellCount).setCellValue(aqaStudents.getPlace());
            cellCount++;
        }

        try (FileOutputStream fout = new FileOutputStream(path)) {
            workbook.write(fout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
