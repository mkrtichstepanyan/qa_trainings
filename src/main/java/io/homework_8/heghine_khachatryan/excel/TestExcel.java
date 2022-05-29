package io.homework_8.heghine_khachatryan.excel;

import java.time.LocalDate;

public class TestExcel {
    public static void main(String[] args) {
        ExcelReader.readFromExcel("src/main/java/io/homework_8/heghine_khachatryan/excel/excel.xlsx",
                0);
        ExcelWriter.writeInExcel("src/main/java/io/homework_8/heghine_khachatryan/excel/testWrite.xlsx",
                QAStudents.QAStudentsList());
        ExcelModifier.removeSheetFromExcel("src/main/java/io/homework_8/heghine_khachatryan/excel/testWrite.xlsx",
                1);
        ExcelModifier.updateCellValue("src/main/java/io/homework_8/heghine_khachatryan/excel/testWrite.xlsx",
                0, 3, 15, LocalDate.now());
        ExcelModifier.removeRowFromExcel("src/main/java/io/homework_8/heghine_khachatryan/excel/testWrite.xlsx",
                0, 1);
        ExcelModifier.removeCellValueFromExcel("src/main/java/io/homework_8/heghine_khachatryan/excel/testWrite.xlsx",
                0, 2, 2);
    }

}
