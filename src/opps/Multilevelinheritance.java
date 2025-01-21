package opps;


class Grandfather{
String firstName;
String lastName;
int age;

public void firstname() {
	System.out.println("GrandFather first name is Surya");
}

public void lastname() {
	System.out.println("GrandFather last name is Vardhan ");
}

public void age() {
	System.out.println("age is 90");
}

}

class Father extends Grandfather{
	
	String occupation;
	
	public void firstname() {
		System.out.println("Father first name is Mourya  ");
	}

	public void lastname() {
		System.out.println("Father last name is Vardhan ");
	}

	public void age() {
		System.out.println("age is 55");
	}
	
	public void occupation() {
		System.out.println("occupation is farmer");
	}
	
}

class Children extends Father{
	public void firstname() {
		System.out.println("Children first name is Harsha  ");
	}

	public void lastname() {
		System.out.println("Children last name is Vardhan ");
	}

	public void age() {
		System.out.println("age is 25");
	}
	
	public void occupation() {
		System.out.println("occupation is Engineer");
	}
	
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfather gf = new Grandfather();
		gf.firstname();
		gf.age();
		Father fr= new Father();
		fr.firstname();
		fr.age();
//		Father fh=new Children();
//      Children ch=(Children) fh;
//		ch.lastname();
//      ch.firstname();
        Children child=new Children();
        child.firstname();
        child.age();
	}
}
