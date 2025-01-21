package programs;

public class ReversewordSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="Tejashwini is a good girl";//lrig doog a si iniwhsajeT
		String reverse="";
		String[] words = sentence.split(" ");
		for(String w:words) {//for(datatype variablename:content type which we want)
			for(int i=w.length()-1;i>=0;i--) {
			    reverse=reverse+w.charAt(i);
			}
			reverse=reverse+" ";
	     }
		System.out.println(reverse);
	}

}
