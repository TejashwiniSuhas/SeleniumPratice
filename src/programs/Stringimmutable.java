package programs;

public class Stringimmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String immutable means string value cannot be changed
      StringBuilder sb=new StringBuilder("Tejashwini");
      sb.append("Krishna");
      System.out.println("string sb:"+sb);
      StringBuffer sf=new StringBuffer("automation");
      sf.append("testing");
      System.out.println("string sf:"+sf);
	}

}
