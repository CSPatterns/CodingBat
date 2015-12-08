package CodingBat;

public class TestBackAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String backAround(String str) {
		
		
		//first + mid + last
		 char last = str.charAt(str.length()-1);
		 
		 return last + str +last;
	
	}


}
