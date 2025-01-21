package programs;

public class Numberreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=743,result=0,num1=0;
     while(num!=0) {
     num1=num%10;//num1=3,num=743/num1=4,num=74/num1=0.7->7,num=7
     result=result*10+num1;//result=3,34,347
     num=num/10;//num=74,7
     }
     System.out.println(result);
	}

}
