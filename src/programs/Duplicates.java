package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print without duplicates
         List<Integer> l1=new ArrayList<Integer>();
         l1.add(1);
         l1.add(2);
         l1.add(3);
         l1.add(2);
         System.out.println(l1);
         HashSet<Integer> h1=new HashSet<Integer>();
         h1.addAll(l1);
         System.out.println(h1);
         //print only duplicates
         List<String> s1=new LinkedList<String>();
         s1.add("tejashwini");
         s1.add("manjula");
         s1.add("tejashwini");
         System.out.println(s1);
         HashSet<String> s2=new HashSet<String>();
         List<String> l2=new ArrayList<String>();         
         for(String i:s1) {
           if(!s2.add(i)) {
        	 System.out.println(i);
        	 l2.add(i);
        	 System.out.println(l2);
        	 }
         }
	}

}
