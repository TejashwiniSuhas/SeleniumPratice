package checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ioexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BufferedReader bf=null;
        try {
			bf=new BufferedReader(new FileReader("abc"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	try {
        		if(bf!=null) {
        			bf.close();
        		}
        	}
        	catch(IOException e){
        		e.printStackTrace();
        	}
        }
	}

}
