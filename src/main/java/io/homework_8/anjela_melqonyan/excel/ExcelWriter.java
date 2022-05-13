package io.homework_8.anjela_melqonyan.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExcelWriter {

    public static void main(String[] args) throws IOException {

        Workbook wb = new XSSFWorkbook();

      Sheet newsheet = wb.createSheet( " my sheet ");
        Row row;

        Map < String, Object[] > emp = new TreeMap < String, Object[] >();
        emp.put( "1", new Object[] {
                "NAME", "SURNAME", "PHONE", "ADDRESS" });

        emp.put( "2", new Object[] {
                "Anna", "Araelyan", "99775566", "M. Xorenaci" });

        emp.put( "3", new Object[] {
                "Karen", "Davtyan", "93556621", "P. Sevak" });

        emp.put( "4", new Object[] {
                "Ani", "Hakobyan", "93475599", "Av. Isahakyan" });

        emp.put( "5", new Object[] {
                "Ashot", "Martirosyan", "99112336", "E. Charenc" });

        emp.put( "6", new Object[] {
                "Varduhi", "Serobyan", "94638799", " X. Abovyan" });


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


       FileOutputStream fl= new FileOutputStream
               ("src/main/java/io/homework_8/anjela_melqonyan/excel/excel1.xlsx");
       wb.write(fl);
       fl.close();


       System.out.println("Written successfully");


    }
}
