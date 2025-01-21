package programs;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="tejashwinikrishna798";
        int digitcount=0;
        int charcount=0;
         char[] s2=s1.toCharArray();
         //using character class
        for(Character c:s2)
        {
             if(Character.isDigit(c))
             {
            	 digitcount++;
             }
             else
             {
            	charcount++; 
             }
        }
        //without using Character class
//         for(int i=0;i<=s1.length()-1;i++) {
//        	 if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
//        	 {
//        		 digitcount++;
//        	 }
//        	 
//         }
//         for(int i=0;i<=s1.length()-1;i++) {
//        	 if(s1.charAt(i)>=97 && s1.charAt(i)<=122)
//        	 {
//        		 charcount++;
//        	 }
//         }
        System.out.println("number of digits in the string is: "+digitcount);
        System.out.println("number of char in the string is: "+charcount);        
	}

}
