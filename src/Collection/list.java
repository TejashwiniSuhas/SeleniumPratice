package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class list {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Arrays have fixed length and homogenous data , we can't add data to overcome it we have arraylist
		List<Integer> i=new ArrayList<Integer>();//array list is used to retrive the elements fastly , it is unsynchronized
		List<Integer> j=new ArrayList<Integer>();
		 i.add(1);
		 i.add(2);
		 i.add(3);
		 i.add(4);
		 i.add(5);
		 j.add(11);
		 j.add(12);
		 j.add(11);
		 System.out.println(i);
		 i.add(6);
		 //System.out.println(i);
		 i.set(3, 7);
		 //System.out.println(i);
		 i.add(4, 8);
		 //System.out.println(i);
		 //i.clear();
		 i.addAll(j);
		 System.out.println(i);
		Iterator<Integer> it=i.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}}
}
