package Package2;

public class twodimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int add[][] = {
				{4,5,6},				// add[0][0] add[0][1] add[0][2]
				{4,6,2},				// add [1][0] add [1][1] add[1][2]
				{10,20,30}				// add[2][0] add [2][1] add [2][2]
			
		};
	//	System.out.println(add.length);		
		for(int i=0; i <add.length; i++) 
		{				// i will stand for row;  j will stand for column in that row
				
			for (int j =0; j< add.length; j++) 
			{
			System.out.print(add[i][j] + " ");	
			}
		System.out.println();
		
	}
	}

}
