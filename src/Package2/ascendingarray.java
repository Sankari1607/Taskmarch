package Package2;

import java.util.Arrays;

public class ascendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//flip flaping
		int [] d= {8,3,6,5,2};			//{3,8,6,5,2}
		int temp =0;					//{2,8,6,5,3} 	{2,6,8,5,2} {2,3,8,6,5){2,3,6,8,5} {2,3,5,8,6){2,3,5,6,8)
		
		
		System.out.println("Elements of original array:");
		for(int i=0; i<d.length; i++)
		{
			System.out.print(d[i] + " ");
		}
		for (int i = 0; i<d.length; i++)
		{
		
			for (int j = i+1; j<d.length; j++)
		
		{
				if(d[i]>d[j]) {
					temp=d[i];
					d[i]=d[j];
					d[j] = temp;
				}
		}
		
		}
		System.out.println();
		
		System.out.println("Elements of array sorted in Ascending order:");
		for(int i = 0; i<d.length; i++)
		{
			System.out.print(d[i]+" ");
		}
		//System.out.println(Arrays.toString(d));
	}

}
