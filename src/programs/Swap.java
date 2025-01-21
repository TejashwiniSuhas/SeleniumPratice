package programs;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=2;
		int b=7;
		int temp;
		
//		 temp=a;//temp=0->5,a=5
//		 a=b;//a=5->10,b=10
//		 b=temp;//b=10->5,temp=5
		System.out.println("after swap a "+a+" b:"+b);
		a=a+b;//a=5->15,b=10
		b=a-b;//b=10->5,a=15
		a=a-b;//b=5,a=15->10
		System.out.println("after swap without 3rd variable a "+a+" b:"+b);
		//before->a=1,b=2,c=3,after->c=2,b=1,a=3
//		int a=21;
//		int b=34;
//		int c=65;
//		System.out.println("before swap a "+a+" b:"+b+"c :"+c);
//		a=a+b+c;
//		b=a-(b+c);//b=2-1,b=1
//		c=a-(b+c);//c=3-1,c=2
//		a=a-(b+c);//a=2+1,a=3
//		System.out.println("after swap a "+a+" b:"+b+"c :"+c);
		String s1="Tejashwini";
		String s2="Tejashwini"; 
		String s3=new String("Tejashwini");
		System.out.println(s1==s2); 
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3); 
		System.out.println(s1.equals(s3));
	}

}
