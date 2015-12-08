package CodingBat;

public class TestFront22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String front22(String str) {
		   String firstTwo; 
		   
		   if(str.length() <1)
		   return str + str + str;
		   
		   else if(str.length() <3)
		    return str + str + str;
		   
		   else
		   
		   firstTwo = str.substring(0,2);

		  return firstTwo + str + firstTwo;
		}
}
