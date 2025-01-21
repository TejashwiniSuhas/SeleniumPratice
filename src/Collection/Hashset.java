package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it doesn't allow duplicates,as it has hashcode for each value
		//it allows only one null value
		//it print random sequence of value 
          HashSet<String> hs=new HashSet<String>();
          hs.add("Tejashwini");
          System.out.println(hs.hashCode());
          hs.add("Suhasan");
          System.out.println(hs.hashCode());
          hs.add("Krishna");
          System.out.println(hs.hashCode());
          hs.add("Manjula");
          System.out.println(hs.hashCode());
          hs.add(null);
          hs.add(null);
          System.out.println(hs);
          System.out.println(hs.hashCode());
          Iterator hst=hs.iterator();
          while(hst.hasNext()) {
        	 System.out.println(hst.next());
          }
	}

}
