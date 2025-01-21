package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectorlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vector is same as arraylist but it is synchronized hence it's performance is slow compare to arraylist
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(48);
        v1.add(57);
        v1.add(97);
        v1.add(122);
        v1.add(65);
        v1.add(90);
        System.out.println(v1);
        v1.add(0, 91);
        System.out.println(v1);
        v1.set(0, 96);
        System.out.println(v1);
        Iterator vt1=v1.iterator();
        while(vt1.hasNext()) {
        	System.out.println(vt1.next());
        }
        
	}

}
