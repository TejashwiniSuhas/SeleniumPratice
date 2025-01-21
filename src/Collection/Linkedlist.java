package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in future we want to manipulate means add & delete data we use linked list as it is faster performance then array list
		//it is unsynchronized
        List<String> l1= new LinkedList<String>();
        List<String> s1= new LinkedList<String>();
        l1.add("Tejashwini");
        l1.add("teju");
        l1.add("Krishna");
        l1.add("Radha");
        l1.add("RK");
        //System.out.println(l1);
        l1.add("Vamsi");
        l1.add("Krishna");
        //System.out.println(l1);
        l1.set(1, "Krishna");
        l1.add(2, "Manjula");
        //System.out.println(l1);
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("d");
        l1.addAll(s1);
        //System.out.println(l1);
        l1.addAll(4, s1);
        System.out.println(l1);
        Iterator<String> lt1=l1.listIterator();
        while(lt1.hasNext()) {
        	System.out.println(lt1.next());
        }
        l1.remove(0);
        l1.remove("a");
        System.out.println(l1);
//        Spliterator<String>st1=l1.spliterator();
//        //st1.tryAdvance(System.out::println); // Prints the next element
//        //st1.forEachRemaining(System.out::println); 
//        Spliterator<String> spliterator1 = st1.trySplit();
//        //System.out.println(spliterator1);
//        if (spliterator1 != null) {
//            // Parallel processing of the split part
//            spliterator1.forEachRemaining(System.out::println);
//        }// Processes all remaining elements

        }

}
