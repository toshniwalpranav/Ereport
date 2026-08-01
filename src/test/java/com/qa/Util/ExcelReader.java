package com.qa.Util;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.*;

	import org.apache.poi.ss.usermodel.*;

	public class ExcelReader {

	    public List<Map<String, String>> getData(String filePath, String sheetName) throws IOException {
        //list store the data but in key and value pair
	    	
	        Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath));
	        //file input read data from excel
	        
	        Sheet sheet = workbook.getSheet(sheetName);
	        //This line gets a specific sheet from the Excel workbook.

	        List<Map<String, String>> data = new ArrayList<>();
	        //A List stores multiple objects in order.                  //Creates an empty list.

	        Row headerRow = sheet.getRow(0);

	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	            Row row = sheet.getRow(i);
	            Map<String, String> rowData = new LinkedHashMap<>();
	            //An empty map is created.

	            for (int j = 0; j < headerRow.getLastCellNum(); j++) {
	            	//header mean name...

	                String key = headerRow.getCell(j).toString();
	                //This line reads the column name (header) from the Excel sheet and stores it as a key.
	                
	                String value = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
	                //returns null, and calling .toString() would cause a NullPointerException.

	                rowData.put(key, value);
	            }

	            data.add(rowData);
	        }

	        workbook.close();
	        return data;
	    }
	}


