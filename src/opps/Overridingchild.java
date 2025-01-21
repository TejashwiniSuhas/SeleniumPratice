package opps;

public class Overridingchild extends Overridingparent{

	public void add(int a, int b) {
		int c=a+b;
		System.out.println("the value of c"+ c);
	}
	
	public void subtract(int a, int b) {
		int d=a-b;
		System.out.println("the value of d"+ d);
	}
	public void mulitply(int a,int b)
	{
		int e=a*b;
		System.out.println("the value of e"+ e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Overridingchild child = new Overridingchild();
      child.add(5, 6);
      child.subtract(10, 6);
      child.mulitply(3, 4);
	}

}
