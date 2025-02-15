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

public class ReferenceData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		FileOutputStream file=new FileOutputStream("C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\TestData\\ReferenceSheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
	    XSSFSheet sheet=workbook.createSheet("ReferenceSheet");
	    XSSFRow row;
	    HashMap<String,Object[]> mp=new HashMap<String,Object[]>();
	    Set<String> rows=mp.keySet();
	    mp.put("1", new Object[] {"FirstName","LastName","Phno","Location"});
	    mp.put("2", new Object[] {"Tejashwini","Krishna","8296295860","Hoskote"});
	    mp.put("3",new Object[] {"Suhasan","Rajshekhar","7349675203","Malur"});
	    mp.put("4", new Object[] {});
	    mp.put("5", new Object[] {"Manjula","R","9342892038","Hoskote"});
	    int rownum=0;
	    for(String rowwise:rows) {
	    	row=sheet.createRow(rownum++);
	    	Object[] values=mp.get(rowwise);
	    	int coulmnnum=0;
	    	for(Object value:values) {
	    		XSSFCell cell=row.createCell(coulmnnum++);
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
