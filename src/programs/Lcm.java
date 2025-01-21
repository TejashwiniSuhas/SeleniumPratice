package programs;

import java.util.LinkedList;

public class Lcm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1=12;
      int num2=18;
      int n1;
      int n2;
      LinkedList<Integer> list1 =new LinkedList<>();
      LinkedList<Integer> list2 =new LinkedList<>();
      for(int i=1;i<=num1;i++) {
    	  n1=num1*i;
    	  list1.add(n1);
    	  
    	 for(int j=1;j<=num2;j++) {
    		 n2=num2*j;
    		 list2.add(n2);    		 
    	 } 
      }
      //System.out.println(list1);
     // System.out.println(list2);
      for(Integer l:list1) {
    	  for(Integer m:list2) {
    		  if(l==m) {
    			  System.out.println(l);
    			  int small=Integer.MIN_VALUE;
    			  for(int a=l;a<l;a++) {
    				  if(a<small) {
    					  small=a;
    					 // System.out.println(a);
    				  }
    			  }
    			  
    		  }
    	  }
      }
	}

}
