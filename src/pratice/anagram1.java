package pratice;

import java.util.Arrays;

public class anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="suhasan";
		String a2="hassan";
		if(a1.length()==a2.length()) {
			char[] c1=a1.toCharArray();
			char[] c2=a2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("is Anangram");
			}
			else
			   System.out.println("is not anagram");
			
		}
		else
			System.out.println("is not anagram");

	}

}
