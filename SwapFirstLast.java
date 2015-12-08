package CodingBat;

public class SwapFirstLast {

	public static void main(String[] args) {
		String code = "Code";
		
		SwapFirstLast s = new SwapFirstLast();
		System.out.println(s.frontBack(code));

	}
	

	
	public String frontBack(String str) {

		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  System.out.println(mid);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}
	
	
	
}
