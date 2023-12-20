package Package2;

import java.util.Arrays;

public class oddevenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {9,7,4,11,3,5,6,12};
		int[] temp= new int[arr.length];
				int j = 0;
				int k = arr.length-1;
				for (int i = 0; i<arr.length; i++)
				{
					if(arr[i]%2!=0) {
						temp[j++] = arr[i];
						
					}
					else
						temp[k--] = arr[i];
					
				}
				System.out.println(Arrays.toString(temp));
	}
	

}
