package checkedexception;

public class ClassnotfoundException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			Class.forName("Tejashwini");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
		}
	}

}
