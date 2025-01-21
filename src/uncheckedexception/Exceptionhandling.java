package uncheckedexception;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Arithmetic exception 
		try//logic
		{
		int n=9;
		n=n/0;
		}
		catch(ArithmeticException d)//exception
		{
		System.out.println(d);
		}
		try{
			String s=null;
		int length=s.length();
		}
		catch(NullPointerException n){
		System.out.println(n);
		}
		try
		{String s="abc";
		int i= Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
		System.out.println(e);
		}
		try{
			int[] ar= {0,1,2,3};
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
		    System.out.println(a);
		}
	}

}
