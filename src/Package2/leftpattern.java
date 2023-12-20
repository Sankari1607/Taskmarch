package Package2;

public class leftpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,row=6;
		for(i=0; i<=row; i++)
		{
			for(j=2*(row-i); j>=0; j--)
			{
				System.out.print(" ");
						
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(" *");
			}
		System.out.println();
		}
		
				
	}

}
