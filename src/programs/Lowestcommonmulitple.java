package programs;

public class Lowestcommonmulitple {
public static int lcm(int num1,int num2) {//num1=12,num2=18
    int greatest=Math.max(num1, num2);//great=18
    int lowest=Math.min(num1, num2);//low=12
    for(int i=greatest;;i+=greatest) {//i=i+greatest
   	   if(i%lowest==0) {
   		 return i;
   	  }
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n1=12;
     int n2=18;
        System.out.println(lcm(n1,n2));
	}

}
