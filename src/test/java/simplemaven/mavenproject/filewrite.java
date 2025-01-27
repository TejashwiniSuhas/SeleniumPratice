package simplemaven.mavenproject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class filewrite {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       FileOutputStream fs = null;
	try {
		fs = new FileOutputStream("C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\TestData\\InputSheet.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       XSSFWorkbook xw=new XSSFWorkbook();
       XSSFSheet xs=xw.createSheet("inputdata");
       XSSFRow row;
       Map<String,Object[]> mp=new HashMap<String,Object[]>();
       mp.put("1", new Object[]{"Name","Age","Department"});
       mp.put("2", new Object[]{"Tejashwini","25","testing"});
       mp.put("3", new Object[]{"Suhasan","28","Design"});
       mp.put("4", new Object[]{"Manjula","43","Finance"});
       Set<String> st=mp.keySet();//no of rows
       int rownum=0;
       for(String s:st) {
    	   row=xs.createRow(rownum++);//create row
    	   Object[] ob=mp.get(s);//gives the values of row
    	   int coulmnnum=0;
    	   for(Object o:ob) {//iterating row value
    		  XSSFCell xc=row.createCell(coulmnnum++);//create coulmn value
    		  xc.setCellValue((String)o);//set the value from coulmn in form of string 
    	   }
       }
       try {
		xw.write(fs);//to write the data in the specified path of workbook
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		fs.close();//once after writing the data close the file as it might cause some exception
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
