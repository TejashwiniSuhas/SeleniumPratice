package programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;
		 int num1 = 0;
		 int num2=num;
		 int cube = 0;
	 	 while(num!=0)
	 	 {
		 num1=num%10;//1,7,0.3->3
		 num=num/10;//37,3
		 cube=(int) (cube+Math.pow(num1, 3));//1,343,27
		}
	if(num2==cube) {
		System.out.println(cube);
		}
	}
}
