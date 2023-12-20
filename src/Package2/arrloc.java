package Package2;

import java.util.Arrays;

public class arrloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]start= {4,7,8,20,3};
		int loc =2;
		for (int i=start.length -1; i>loc; i--)
		{
			start[i] = start[i-1];		//start[4] = start[3]
			
			}
		start[loc]=100;				//answer {4,7,100,8,20)
		
		System.out.println(Arrays.toString(start));
	}
	

}
