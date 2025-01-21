package programs;

public class Stringsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="10";
     String s2="20";
     Integer s3=Integer.valueOf(s1);//valueof gives just value
     Integer num1=Integer.parseInt(s1);//convert string to integer
     Integer s4=Integer.valueOf(s2);
     Integer num2=Integer.parseInt(s2);
     String s5="";
     s5=String.valueOf(s3+s4);
     s5=String.valueOf(num1+num2);
     System.out.println(s5);
	}

}
