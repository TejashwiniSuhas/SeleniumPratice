package programs;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*    
    1
   123
  12345
 1234567
123456789
	*/
		for(int i=1;i<=5;++i) {//rows
        	for(int j=i;j<5;j++) {//leading spaces
        		System.out.print(" ");
        	}
        	char ch='a';
        	for(char k=1;k<=(2 *i-1);k++) {
        		System.out.print(ch);//content
        		ch++;
        	}
  	     System.out.println();
        }
	}

		
	/*
1
12
123
1234
12345

a
ab
abc
abcd
abcde

		for(int i=1;i<=5;i++) {
			for(char ch='a';ch<'a'+i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
			}
 */	
		
/*
12345
1234
123
12
1
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			}	
			*/
}


