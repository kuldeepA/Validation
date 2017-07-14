package com.fci.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.fci.core.Constants;

public class ReadL15 {

	public Map<String, String> readApplication() {
		
		Workbook workbook = null;
		
		try {
			InputStream excelFile = new FileInputStream(Constants.PATH);
			workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(1);
			Iterator<Row> iterator = datatypeSheet.iterator();
			while(iterator.hasNext()) {
			
				
			}
		}
		catch(Exception e) {}
		return null;
	}
}
