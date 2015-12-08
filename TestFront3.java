package CodingBat;

public class TestFront3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public String front3(String str) {
		  String x;
		  
		  if(str.length() <3) return str + str + str;
		  
		  else 

		  x =  str.substring(0,3).toString();
		  return x  + x + x;
		}
}
