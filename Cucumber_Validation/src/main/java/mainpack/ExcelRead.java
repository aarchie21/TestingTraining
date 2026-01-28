package mainpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public List<String> excelRCD(int vRow, int vColumn) throws IOException {
        List<String> result = new ArrayList<>();

        FileInputStream fi = new FileInputStream("./data/data2.xlsx");
        Workbook wb = new XSSFWorkbook(fi);
        Sheet sheet = wb.getSheetAt(0);

        Row row = sheet.getRow(vRow);
        String value = "";

        if (row != null) {
            Cell cell = row.getCell(vColumn);
            DataFormatter formatter = new DataFormatter();
            value = (cell != null) ? formatter.formatCellValue(cell) : "";
        }

        result.add(value);

        wb.close();
        fi.close();
        return result;
    }

public void insertData1(int vRow1, int vColumn1 , String status) throws IOException {


	 FileInputStream fis = new FileInputStream("./data/data2.xlsx");
	 Workbook wb = new XSSFWorkbook(fis);
	 Sheet sheet = wb.getSheetAt(0);
	 
	 
	 Row row = sheet.getRow(vRow1);

	 if (row == null) {
        row = sheet.createRow(vRow1);
	 }

	 Cell cell = row.getCell(vColumn1);

if (cell == null) {
        cell = row.createCell(vColumn1);
    }

	 cell.setCellValue(status);
	      
	 System.out.println("Value inserted: " + status);	

	}
}