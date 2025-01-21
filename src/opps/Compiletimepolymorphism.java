package opps;

//Method Overloading
public class Compiletimepolymorphism {

	public static void messages(String text) {
		System.out.println("write the text msg"+ text);
	}
	
	public static void messages(String text,String phno) {
		System.out.println("write the text msg" + text+" & phone number"+ phno);
	}
	public static void messages(String text,String phno,String emoji) {
		System.out.println("write the text msg" + text+" & phone number"+ phno+"emoji"+ emoji);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletimepolymorphism cp=new Compiletimepolymorphism();
		cp.messages("Hi");
		cp.messages("Hi", "8296295860");
		cp.messages("Hi", "8296295860","smile");
	}

}
