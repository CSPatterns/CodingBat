package CodingBat;

public class TestStartHi {

	public static void main(String[] args) {
		
		String s = "hi ho";
		System.out.println(s.substring(0, 2));
		if (s.substring(0,2) == "hi"){
			System.out.println("true");
		}
		
		TestStartHi t = new TestStartHi();
		System.out.println(t.startHi(s));

	}
	
	public boolean startHi(String str) {

		  if (str.length() < 2) 
		      return false;
		  
		  else if (str.substring(0,2) == "hi")
		            return true;
		  
		  else
		  return false;
		  
		}


}
