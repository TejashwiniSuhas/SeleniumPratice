package Collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it prints in the order of insertion main difference bw linked and hashset
        LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
        lh.add(1);
        lh.add(2);
        lh.add(48);
        lh.add(57);
        lh.add(65);
        lh.add(90);
        lh.add(null);
        lh.add(null);
        System.out.println(lh);
        System.out.println(lh.size());
	}

}
