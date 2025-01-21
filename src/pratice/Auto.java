package pratice;

public class Auto {
	
	public static boolean auto(int num) {
		int square=(int) Math.pow(num, 2);
		while(num!=0) {
			if(num%10!=square%10) {
				return false;
			}
			num=num/10;
			square=square/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(auto(5)?"automorphic":"not automorphic");
	}

}
