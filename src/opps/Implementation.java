package opps;

public class Implementation implements Interface{

	@Override
	public void firstname() {
		// TODO Auto-generated method stub
		System.out.println("Tejashwini");
		
	}

	@Override
	public void lastname() {
		// TODO Auto-generated method stub
		System.out.println("krishna");
		
	}

	@Override
	public void Education() {
		// TODO Auto-generated method stub
		System.out.println("ECE");
		
	}
	 
	public static void main(String[] args) {
		Implementation ip=new Implementation();
		ip.firstname();
		ip.lastname();
		ip.Education();
	}

}
