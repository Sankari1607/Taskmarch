package String;

public class String_Buf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Thilak");
		
		System.out.println(sb.hashCode());
		
		sb=sb.reverse();
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
	}

}
