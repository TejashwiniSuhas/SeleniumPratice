package Collection;

import java.util.List;
import java.util.Stack;

public class Stacklist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lifo
		Stack<Integer> st1=new Stack<Integer>();
		st1.add(1);
		st1.add(2);
		st1.add(3);
		st1.add(4);
		st1.add(6);
		System.out.println(st1);
		st1.push(7);
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		int l1=st1.peek();
		System.out.println(l1);
		}
}
