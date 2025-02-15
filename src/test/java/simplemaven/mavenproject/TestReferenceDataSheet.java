package simplemaven.mavenproject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReferenceDataSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream file=new FileOutputStream("C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\TestData\\TDM_Reference.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("EmployeeDetails");
			XSSFRow row;
	        HashMap<String,Object[]> mp=new HashMap<String,Object[]>();
	        mp.put("1", new Object[]{"EmployeeId","Designation","DateOfJoining","laptopAllocated"});
	        mp.put("2", new Object[]{"1","TESTER","Feb28","Dell"});
	        mp.put("3", new Object[]{"2","	AutomationTESTER","May01","HP"});
	        mp.put("4", new Object[]{"3","Developer","March28","lenova"});
	        mp.put("5", new Object[]{"4","Devops","Jan28","Dell"});
	        Set<String> noOfRows=mp.keySet();
	        int rownum=0;
	        for(String rowwise:noOfRows) {
	        	row=sheet.createRow(rownum++);
	        	Object[] values=mp.get(rowwise);
	        	int coulmn=0;
	        	for(Object value:values) {        		
	        		XSSFCell cell=row.createCell(coulmn++);
	        		cell.setCellValue((String)value);
	        	}
	        }
	        workbook.write(file);
	        file.close();
	        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
