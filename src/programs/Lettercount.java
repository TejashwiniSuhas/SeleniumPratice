package programs;

public class Lettercount {

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
             if(Character.isLetter(c))
             {
            	charcount++; 
             }
        }
        System.out.println("number of digits in the string is "+digitcount);
        System.out.println("number of char in the string is "+charcount);
	}

}
