package programs;

public class Stringreverse {
	    public static void main(String[] args) {
	        String str = "Hello";
	        char[] charArray = str.toCharArray();  // Convert string to character array
	        
	        // Reverse the character array in place
	        int start = 0;
	        int end = charArray.length - 1;
	        
	        while (start < end) {
	            // Swap characters
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;
	            
	            // Move the indices towards the center
	            start++;
	            end--;
	        }
	        
	        // Convert the character array back to a string
	        String reversedStr = new String(charArray);
	        System.out.println(reversedStr);  // Output: "olleH"
	    }
	}

