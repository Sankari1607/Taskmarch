package array;

public class findingduplicate {

	public static void main(String[] arg) {
		
		int [] arr= {1,6,4,3,4,3,4,5,5,4,2,1,8};
		for (int i=0; i<arr.length; i++)
		{
			int count = 1;
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]==arr[j]) {
					count ++;
					arr[j] ='\0';
			}
			}
		
		if((count >1) && arr[i] != '\0') {
			System.out.println(arr[i] + " is displayed " + count + " :Times");
		
		}
		}
	}
}
