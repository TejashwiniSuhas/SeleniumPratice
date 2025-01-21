package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can add and delete elements from both end and it is faster then arraylist and stack
            ArrayDeque<Integer> aq=new ArrayDeque<Integer>();
            aq.add(48);
            aq.add(57);
            aq.add(97);
            aq.add(122);
            aq.add(65);
            aq.add(90);
            System.out.println(aq);
            aq.addFirst(1);
            System.out.println(aq);
            aq.addLast(2);
            System.out.println(aq);
            System.out.println(aq.peek());
            System.out.println(aq.peekLast());
            aq.poll();
            System.out.println(aq);
            aq.pollLast();
            System.out.println(aq);
            aq.pop();
            System.out.println(aq);
            aq.push(48);
            System.out.println(aq);
            Iterator aqt=aq.iterator();
            while(aqt.hasNext()) {
            	System.out.println(aqt.next());
            }
	}

}
