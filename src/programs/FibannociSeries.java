package programs;

public class FibannociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //0 1 1 2  3 5 8 13 21
		int i=0;
		int j=1;
		while(i<=20) {
			System.out.print(i+" ");
			int k=i+j;//i=0,j=1/i=1,j=1/1,2/2,3
			i=j;//i=1,1,2,3
			j=k;//j=1,2,3,5
		}
	}

}
