package Package2;

public class descendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []d = new int[] {87,67,42,88,24,99};
		int temp = 0;
		int i, j;
		//displaying elements of original array
		System.out.println("Elements of original array:");
		
		for (i=0; i<d.length; i++)
		{
			System.out.print(d[i]+ "  ");
		}
		
		for(i=0; i<d.length; i++)
		{
			for(j=i+1; j<d.length; j++)
			{
				
				if (d[i] < d[j])
				{
					
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
							
				}
			}
		}
		System.out.println(); // displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order:");
		
		for(i=0; i<d.length; i++)
		{
			System.out.print(d[i]+"  ");
		}
		
		
	}

}
