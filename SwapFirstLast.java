package CodingBat;

public class SwapFirstLast {

	public static void main(String[] args) {
		String code = "Code";
		
		SwapFirstLast s = new SwapFirstLast();
		System.out.println(s.frontBack(code));

	}
	

	
//	public String frontBack(String str) {
//		
//		 //System.out.println(str.length()-1);
//		  if (str.length() <= 1) return str;
//		  
//		  String mid = str.substring(1, str.length()-1);
//		  System.out.println(mid);
//		  
//		  // last + mid + first
//		  return str.charAt(str.length()-1) + mid + str.charAt(0);
//		}
	
	
	public String front3(String str) {
		  String x;
		  
		  if(str.length() <3) return str + str + str;
		  
		  else 

		  x =  str.substring(0,3).toString();
		  return x  + x + x;
		}
}
