package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
        Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
        mp.put("Tejashwini", 1);
        mp.put("Manjula", 2);
        mp.put("Suhasan", 3);
        System.out.println(mp);
        mp.remove("Manjula");
        System.out.println(mp);
	}

}
