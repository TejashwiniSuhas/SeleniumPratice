package programs;
//number divisible by 1 & itself
public class Primenumber {
public static boolean prime(int n) {//n=4
	if(n<2)//4<2
	{
		return false;
	}
	for(int i=2;i<n;i++)//2<4
	{
		if(n%i==0)//4/2 reminder=0
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=100;
		for(int i=num1;i<=num2;i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
		boolean isprime=prime(7);
		if(isprime) {
			System.out.println("the given number is prime number");
		}
		else
			System.out.println("the given number is not prime");
	}
	//a=5
	//b=6
	//a=a+b=5+6=11
	//b=a-b=11-6=5
	//a=a-b=11-5=6
	

}
