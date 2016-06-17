import java.util.*;

public class ProblemOne {

	private static final int LIMIT = 1000;
	private static int sum = 0;
	
	public static void main(String[] args) {
		for(int b = 0; b < LIMIT; b++) {
	    if(multOfThree(b)) {
	  	  sum += b;
	  	  continue;
	    }

	    if(multOfFive(b)) {
	  	  sum += b;
	  	}

	  }
	  
	  System.out.println("\nThe sum of all the multiples of three and five under " + LIMIT + " is: " + sum);
	  
	}
	
	public static boolean multOfThree(int current) {
		if(current % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean multOfFive(int current) {
		if(current % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}