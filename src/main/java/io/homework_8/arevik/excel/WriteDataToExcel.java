package io.homework_8.arevik.excel;

import java.io.File;
import java.io.FileOutputStream;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {
    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet newsheet = workbook.createSheet( " Employee  ");


        XSSFRow row;



        Map < String, Object[] > emp = new TreeMap < String, Object[] >();
        emp.put( "1", new Object[] {
                "EMP ID", "EMP NAME", "DESIGNATION" });

        emp.put( "2", new Object[] {
                "1", "Ann", "Technical Manager" });

        emp.put( "3", new Object[] {
                "2", "Jack", "Accountant" });

        emp.put( "4", new Object[] {
                "3", "Jane", "Technical Writer" });

        emp.put( "5", new Object[] {
                "4", "Alex", "Technical Writer" });

        emp.put( "6", new Object[] {
                "5", "Alina", "Technical Writer" });

        //Iterate over data and write to sheet
        Set < String > keyid = emp.keySet();
        int rowid = 0;

        for (String key : keyid) {
            row = newsheet.createRow(rowid++);
            Object [] objectArr = emp.get(key);
            int cellid = 0;

            for (Object obj : objectArr){
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }
        FileOutputStream out = new FileOutputStream(
                new File("src/main/java/io/homework_8/arevik/excel/excel1.xlsx"));

        workbook.write(out);
        out.close();
        System.out.println("excel1.xlsx written successfully");
    }
}