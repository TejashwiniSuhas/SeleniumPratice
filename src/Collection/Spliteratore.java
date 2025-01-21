package Collection;

	import java.util.*;
	import java.util.stream.*;

	public class Spliteratore {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Java", "Python", "C", "C++", "JavaScript");

	        // Get Spliterator from the list
	        Spliterator<String> spliterator = list.spliterator();

	        // Sequential iteration with tryAdvance
	        //spliterator.forEachRemaining(System.out::println);

	        // Splitting the Spliterator into two parts for parallel processing
	        Spliterator<String> spliterator1 = spliterator.trySplit();
	        if (spliterator1 != null) {
	            // Parallel processing of the split part
	            spliterator1.forEachRemaining(System.out::println);
	        }

	        // Estimate the size
	        System.out.println("Estimated size: " + spliterator.estimateSize());

	        // Parallel stream
	        list.parallelStream().forEach(System.out::println);
	    }
	}


