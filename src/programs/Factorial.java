package programs;
//factorial n*(n-1)*(n-2)
public class Factorial {
	
public static int fact(int n) {// the method which called itself is called recurssive function
	if(n!=0) {
		return n*fact(n-1);//5*fact(4)/5*4*fact(3)/5*4*3*fact(2)/5*4*3*2*fact(1)
	}
	else 
		return 1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial of 5 is :"+fact(5));
	}

}
