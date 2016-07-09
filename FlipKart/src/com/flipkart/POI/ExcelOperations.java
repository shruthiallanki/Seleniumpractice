package com.flipkart.POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import com.flipkart.domain.TestCaseDetails;

public class ExcelOperations 
{

	// Initializing work book variables
	
	public static HSSFWorkbook hSSFWorkbook = null;
	public static HSSFSheet hSSFSheet = null;
	public static Row row = null;
	
    public static FileInputStream fileInputStream = null;
    
	// This is the method to use read the data from excel
    public static int readExcelFile(String fileName,String sheetName)
    {
    	
    	try {
			fileInputStream = new FileInputStream(new File(fileName));
			hSSFWorkbook = new HSSFWorkbook(fileInputStream);
			System.out.println("Excel file is opened");
			hSSFSheet = hSSFWorkbook.getSheet("sheetName");
			System.out.println("Excel sheet is selected");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return hSSFSheet.getPhysicalNumberOfRows();
    	
    	
    }
    
}
