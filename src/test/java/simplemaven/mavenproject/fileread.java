package simplemaven.mavenproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileread {

	public static List<HashMap<String, String>> read() {
		// TODO Auto-generated method stub
      String path="C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\TestData\\InputSheet.xlsx";
      FileInputStream fi=null;//to read data we use file input stream
      String s="inputdata";
      List<HashMap<String, String>> l1=new ArrayList();
      try {
		fi=new FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		XSSFWorkbook xw=new XSSFWorkbook(fi);//which xl to read
		XSSFSheet xs=xw.getSheet(s);//which sheet to read 
		int totalRows=xs.getLastRowNum();
		XSSFRow headerRow=xs.getRow(0);//to read coulmn name
		for(int i=1;i<=totalRows;i++) {
			XSSFRow currentRow=xs.getRow(i);
			HashMap<String, String> mp=new HashMap<String,String>();
			for(int j=0;j<currentRow.getLastCellNum();j++) {
				XSSFCell currentCell=currentRow.getCell(j);
				mp.put(headerRow.getCell(j).toString(),currentCell.toString());
			}
			l1.add(mp);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		fi.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return l1; 
	}

}
