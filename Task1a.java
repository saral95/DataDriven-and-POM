package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Task1a {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Administrator\\eclipse-workspace\\Mavenn\\Excel.xlsx\\Course.xlsx");
		
		FileInputStream f1=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(f1);
		
		Sheet s = w.getSheet("Sheet1");
		
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("Number of rows in sheet:" +rows);
		
		Row r = s.getRow(1);
		int cells = r.getPhysicalNumberOfCells();
		System.out.println("Number of cells:" +cells);
		
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);
			
			for(int j=0; j<r.getPhysicalNumberOfCells(); j++) {
				Cell c1 = r1.getCell(j);
				System.out.println(c1);
			}
		}
		
	
	}

}
