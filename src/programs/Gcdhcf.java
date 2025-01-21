package programs;

import java.util.Arrays;
//lcm=(n1/gcd(n1,n2))*n2
//highest common factor
public class Gcdhcf {
 public static int gcd(int n1,int n2) {
	 if(n2==0)
	 {
		 return n1;
	 }
	 else {
		 return gcd(n2,n1%n2);
	 }
 }
 
 public static int lcm(int a,int b) {
	 return (a/gcd(a,b))*b;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1=12;
       int num2=18;
         System.out.println(gcd(num1,num2));
         System.out.println(lcm(num1,num2));
	}

}
