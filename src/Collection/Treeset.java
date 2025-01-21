package Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//doesn't allow duplicate values and elements get sorted in ascending order
      TreeSet<Integer> ts=new TreeSet<Integer>();
      ts.add(97);
      ts.add(122);
      ts.add(90);
      ts.add(65);
      ts.add(48);
      System.out.println(ts);
      int e=ts.ceiling(90);
      System.out.println(e);
      int f=ts.floor(50);
      System.out.println(f);
      	Set<Integer> s=ts.descendingSet();
      	System.out.println(s);
      	Iterator its=ts.descendingIterator();
      	while(its.hasNext()) {
      		System.out.println(its.next());
      	}
      	System.out.println(ts.headSet(90));
      	System.out.println(ts.headSet(90, true));
      	System.out.println(ts.higher(90));
      	System.out.println(ts.subSet(65, 122));
      	System.out.println(ts.subSet(65, false, 122, true));
      	System.out.println(ts.tailSet(60));
      	System.out.println(ts.tailSet(65, true));
      	TreeSet<Integer> cts=new TreeSet<Integer>(Comparator.reverseOrder());
      	cts.addAll(ts);
      	System.out.println(cts);
      	
	}

}
