package uncheckedexception;

public class MultipleCatchBlock {

	public static void main(String[] args) { //throws Exception{//widely used
		// TODO Auto-generated method stub      
       try{
    	   String name="Tejashwini";
       System.out.println(name.charAt(11));
       }
       
       catch(StringIndexOutOfBoundsException e) {
    	   e.printStackTrace();
       }
       catch(Exception e) {//always exception should be at the last catch block
    	  e.printStackTrace();//the rca of issue it is recommended to always use stacktrace
       }
	}
}


