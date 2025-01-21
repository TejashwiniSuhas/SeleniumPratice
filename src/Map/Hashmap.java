package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> hs=new HashMap<Integer,String>();
       hs.put(11, "Tejashwini");
       hs.put(2, "Suhasan");
       hs.put(13, "Krishna");
       hs.put(4, "Manjula");
       //hs.put(null, null);
       hs.put(1, null);
       hs.put(3, null);
       //hs.put(null, "vin");
       System.out.println(hs);
       hs.replace(13, "Krishna", "HarshaVardhan");
       System.out.println(hs);
       System.out.println(hs.get(3));
       System.out.println(hs.containsKey(4));
       System.out.println(hs.containsValue("Krishna"));
       System.out.println(hs.compute(1, (key, value) -> "Sushasan"));
       System.out.println(hs.compute(3, (key, value) -> "teju"));
	   System.out.println(hs);
	   
	   for(Map.Entry<Integer, String> hd:hs.entrySet()) {
	        if(hd.getKey()>1) {
	        	System.out.println(hd.getValue());
	        }
	   }
	   Set s=hs.keySet();
	   System.out.println(s);
	}

}
