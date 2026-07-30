package com.qa.Util;

public class ExcelReader {
	
	package com.qa.util;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.*;

	import org.apache.poi.ss.usermodel.*;

	public class ExcelReader {

	    public List<Map<String, String>> getData(String filePath, String sheetName) throws IOException {

	        Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath));
	        Sheet sheet = workbook.getSheet(sheetName);

	        List<Map<String, String>> data = new ArrayList<>();

	        Row headerRow = sheet.getRow(0);

	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	            Row row = sheet.getRow(i);
	            Map<String, String> rowData = new LinkedHashMap<>();

	            for (int j = 0; j < headerRow.getLastCellNum(); j++) {

	                String key = headerRow.getCell(j).toString();
	                String value = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();

	                rowData.put(key, value);
	            }

	            data.add(rowData);
	        }

	        workbook.close();
	        return data;
	    }
	}

}
