package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LettercountCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="tejashwini";
          char[] s3=s.toCharArray();//'t'
          Map<Character,Integer> mp=new HashMap<Character,Integer>();
            for(Character c:s3) {
            	if(mp.containsKey(c)) {
            		mp.put(c, mp.get(c)+1);
            	}
            	else {
            		mp.put(c, 1);
            	}
            }   
            for(Entry<Character, Integer> mc:mp.entrySet()) {
            	if(mc.getKey()>1) {
            		System.out.println("the value of character "+mc.getKey()+" count is "+mc.getValue());
            	}
            }
        }
}
