package programs;

public class Reverse {
	public static void main(String args[])
	{
		String name="123456789";//iniwhsajeT
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
			//name=name+name.charAt(i);
		}
		System.out.println(reverse);
	}

}
