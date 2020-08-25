package com.example.application.business;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

@Component
public class ExcelReader {
    public List<List<String>> readExcell(InputStream fis) {
        List<List<String>> table = new LinkedList<>();
        List<String> rowList = new LinkedList<>();
        try
        {
            //creating Workbook instance that refers to .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
            Iterator<Row> itr = sheet.iterator();    //iterating over excel file
            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    rowList.add(cell.getStringCellValue());
                }
                table.add(rowList);
                rowList = new LinkedList<>();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return table;
    }
}
