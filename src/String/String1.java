package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Hemalatha";
		s=s.concat("  Malathi");
		
		System.out.println(s);
		
		String s1=" Muthukumaran";
		
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(4));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('q'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String s2 = "Hi Hello";
		s2 = s2.trim();
		System.out.println(s2);
		
		
	}

}
