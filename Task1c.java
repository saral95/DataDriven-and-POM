package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1c {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Administrator\\eclipse-workspace\\Mavenn\\Excel.xlsx\\Course.xlsx");
		
		FileInputStream f1=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(f1);
		
		Sheet s = w.getSheet("Sheet1");
		
		s.createRow(10).createCell(0).setCellValue("Sarasi");
		
		FileOutputStream fout=new FileOutputStream(f);
		
		w.write(fout);
		
		int noOfRows = s.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		
		Row r = s.getRow(1);
		int noOfcells = r.getPhysicalNumberOfCells();
		System.out.println(noOfcells);
		
		

}
}
