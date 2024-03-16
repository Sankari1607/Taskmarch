package Test12class15;
import java.util.ArrayList;

public class List_to_arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list = new ArrayList<String>();
		list.add("Apple");
		list.add("Pineapple");
		list.add("Orange");
		list.add("Banana");
		System.out.println("Contents of List:" + list);
		System.out.println();
		String [] myArray = new String [list.size()];
		list.toArray(myArray);
		
		for (int i =0; i< myArray.length; i++)
		{
			System.out.println("Element at the Index  " +  i + "  is ::"+ myArray[i] );
		}
		
		
	}

}
