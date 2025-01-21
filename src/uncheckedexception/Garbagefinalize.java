package uncheckedexception;

public class Garbagefinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Tejashwini";
		name=null;
		System.gc();//calls garbage collector
		System.out.println("xyz");
	} 
       public void finalize() {
    	  System.out.println("abc"); 
       }
	}
