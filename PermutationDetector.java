package challenges.arraysAndStrings;

import java.util.Arrays;


public class PermutationDetector {

    public boolean isPermutation(String text, String perm) {
    	
    	if (text.length()!= perm.length()) {
    		return false;
    	}
    	return sort(text).equals(sort(perm));
    }

	private String sort(String text) {
		char[] val1= text.toCharArray();
		Arrays.sort(val1);
		return new String(val1);
		
	}


	
}
