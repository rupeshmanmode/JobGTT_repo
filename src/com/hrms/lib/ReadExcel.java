package com.hrms.lib;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel extends Global {

	public String getValueByCellAddress(String celladress) throws Exception, IOException {
		Workbook wb = Workbook.getWorkbook(new File(exl_file_path));
		Sheet SheetS1 = wb.getSheet("Credentials");
		 Cell Cell = SheetS1.getCell(celladress);
		String Contents = Cell.getContents();
		return Contents;
		
	
	}    }
