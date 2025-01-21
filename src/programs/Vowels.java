package programs;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="TejAshwinI";
		char[] s2=s1.toCharArray();
        for(Character c:s2)
        {
        	if(c =='a' || c =='e' || c =='i' || c=='o'|| c =='u' ||c =='A' || c =='E' || c =='I' || c=='O'|| c =='U')  
        	{
        		 System.out.println("vowels"+" "+c);
        	}
        }
       
	}

}
