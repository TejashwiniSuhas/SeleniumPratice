package simplemaven.mavenproject;

import java.util.HashMap;
import java.util.List;

public class Readdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       fileread fr=new fileread();
       List<HashMap<String, String>> l2=fr.read();
       String firstName=l2.get(0).get("Name");
       String Age=l2.get(0).get("Age");
       String Department=l2.get(0).get("Department");
       System.out.println("the name is "+firstName+" of age "+Age+" and works in department "+Department);
	}

}
