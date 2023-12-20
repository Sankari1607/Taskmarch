package String;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Thilakaghgh";
		String s1= "Thilak";
				
				System.out.println(s.equals(s1));	//false or true
				System.out.println(s.equalsIgnoreCase(s1));
				System.out.println(s.substring(0,4));  // thila
				System.out.println(s.substring(4));
				System.out.println(s.indexOf('a'));
				System.out.println(s.indexOf('u'));		// not available means -1
				System.out.println(s.indexOf('Q'));
				System.out.println(s.lastIndexOf('a'));
				System.out.println(s.toLowerCase());
				System.out.println(s.toUpperCase());
				
				String m= "Hello";
				System.out.println(m.length());
				
				m=m.trim();
				System.out.println(m.length());
				
				String raj = "Hyderapad";
						raj = raj.toUpperCase();
				System.out.println(raj);
				
				
				
	
	
	
	
	
	}

}
