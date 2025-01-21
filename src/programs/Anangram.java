package programs;

import java.util.Arrays;

/*Anangram :
example abc,bac,cba
1.string length same
2.same characters
*/
public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
			if(s1.length()==s2.length()) {
					char[] ch1=s1.toCharArray();//['l','i','s','t','e','n']
					char[] ch2=s2.toCharArray();//['s','i','l','e','n','t']
					Arrays.sort(ch1);//e,i,l,n,s,t
					Arrays.sort(ch2);//e,i,l,n,s,t
					if(Arrays.equals(ch1, ch2)) {
						System.out.println("is Anangram");
					}
					else
						System.out.println("not Anagram");
					
			}
			else
				System.out.println("not Anagram");
	}

}
