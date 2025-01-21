package pratice;

public class armstrongcube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=370;
		int num1=0;
		int num2=num;
		int cube = 0;
		while(num!=0) {
			num1=num%10;
			num=num/10;
			cube=(int) (cube+Math.pow(num1, 3));
		}
		if(num2==cube) {
			System.out.println("is armstrong");
		}

	}
}
