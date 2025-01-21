package uncheckedexception;

public class Exceptionthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
        try {
        	String name="Tejashwini";
            System.out.println(name.charAt(11));
        	throw new StringIndexOutOfBoundsException();//should always be in try block
        }
        catch(Exception e) {
//      	  e.printStackTrace(); //1st instance
        	System.out.println(e.getMessage());
//            throw e;//Recursion and throw same error//2nd instance
         }
         finally{
      	   System.out.println("name"); //comes in 1st instance
         }
	}

}
