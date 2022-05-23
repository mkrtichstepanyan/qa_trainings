package io.homework_8.arevik.csv;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
public class ReadCSVData
{
    public static void main(String[] args)
    {
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("src/main/java/io/homework_8/arevik/csv/csv.csv"));
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.println(token);
                }
                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}