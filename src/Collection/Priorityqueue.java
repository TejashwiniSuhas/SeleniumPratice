package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fifo
                 Queue<String> q1=new PriorityQueue<String>();
                 q1.add("Tejashwini");
                 q1.add("Suhasan");
                 q1.add("Krishna");
                 q1.add("Manjula");
                 q1.add("Manjula");
                 System.out.println(q1);
                 System.out.println(q1.poll());
                 System.out.println(q1.peek());
                 System.out.println(q1);
                 Iterator iq1=q1.iterator();
                 while(iq1.hasNext()) {
                	 System.out.println(iq1.next());
                 }
	}

}
