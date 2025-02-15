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

public class TestdataInputSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			FileOutputStream fs=new FileOutputStream("C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\TestData\\TDM.xlsx");
			XSSFWorkbook xlworkbook=new XSSFWorkbook();
			XSSFSheet xlsheet=xlworkbook.createSheet("Broker");
			XSSFRow row;
			HashMap<String,Object[]> mp=new HashMap<String,Object[]>();
			mp.put("1", new Object[] {"BrokerName","BrokerId"});
			mp.put("2", new Object[] {"GOLD","2000"});
			mp.put("3", new Object[] {"JPM","1860"});
			mp.put("4", new Object[] {"MORGAN","1740"});
			mp.put("5", new Object[] {"DB","3860"});
		    Set<String> key=mp.keySet();
		    int rownum=0;
		    for(String rowwise:key) {
		    	row=xlsheet.createRow(rownum++);
		    	Object[] ob=mp.get(rowwise);
		    	int coulmnnum=0;
		    	for(Object coulmnvalue:ob) {
		    		XSSFCell cell=row.createCell(coulmnnum++);
		    		cell.setCellValue((String)coulmnvalue);
		    	}
		    }
		    xlworkbook.write(fs);
		    fs.close();
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
