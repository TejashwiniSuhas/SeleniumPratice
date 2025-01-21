package Map;

import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String> tm=new TreeMap<Integer,String>();
       tm.put(11, "Tejashwini");
       tm.put(2, "Suhasan");
       tm.put(13, "Krishna");
       tm.put(4, null);
       System.out.println(tm);
       System.out.println(tm.values());
       System.out.println(tm.keySet());
       tm.merge(12, "HarshaVardhan",(oldValue, newValue) -> oldValue + newValue);
       tm.merge(12, "Harsha",(oldValue, newValue) -> oldValue + newValue);
       System.out.println(tm);
       tm.merge(13, "Krishna",(oldValue, newValue) -> null);
       System.out.println(tm);
       tm.putIfAbsent(4, "Manjula");
       System.out.println(tm);
       tm.computeIfAbsent(15, key -> "teju" );
       System.out.println(tm);
       tm.computeIfAbsent(4, key -> "wini" );
       System.out.println(tm);
       tm.computeIfPresent(15, (key,value)-> value+"wini");
       System.out.println(tm);
       tm.computeIfPresent(16, (key,value)-> value+"wini");
       System.out.println(tm);
       tm.computeIfPresent(15, (key,value)-> null);
       System.out.println(tm);
	}
}
