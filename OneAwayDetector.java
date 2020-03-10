package challenges.arraysAndStrings;

public class OneAwayDetector {

    
	public boolean oneAway(String first, String second) {
		
		if (first.length() - second.length() >1) {
			return false;
		}
		else if (first.length() == second.length()+1) {
			OneEditInsert(first,second);
		}
		else if (first.length() == second.length()-1) {
			OneEditInsert(first, second);
		}
		else if (first.length() == second.length()) {
			OneEditReplace(first, second);
		}
		return false;
		
		
	}

	private void OneEditInsert(String first, String second) {
		//Check for one word insert
		int mx =Math.max(first.length(), second.length());
		
		
		
		
	}

	private void OneEditReplace(String first, String second) {
		// TODO Auto-generated method stub
		
	}
	

}
