package programs;

public class Automorphic {
public static boolean auto(int num) {
   
	int square=(int) Math.pow(num, 2);//625

    while(num!=0) {//2
  	  if(num%10 != square%10) {//5 !=5 ,2!=2 // validate unit place
  		return false;  		  
  	  }
  	  else {
  		/*
  		  ten's place validation
  		 */
  		  num=num/10;//2,2
		  square=square/10;//62 ,6
  	  }
     }
    return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(auto(25)?"automorphic":"not automorphic");
	}

}
