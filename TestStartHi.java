package CodingBat;

public class TestStartHi {

	public static void main(String[] args) {
		
		String s = "hiho";
		System.out.println(s.substring(0, 2));
		
		TestStartHi t = new TestStartHi();
		System.out.println(t.startHi(s));

	}
	
	public boolean startHi(String str) {

		  if((str.substring(0,2)) == "hi") 
		  return true;
		  
		  else
		  return false;
		  
		}


}
