package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap2 {
	public static void main(String [] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
			hm.put(1, "Sankari");
			hm.put(2, "Muthukumaran");
			hm.put(3, "Radhana");
			hm.put(4, "Mukilesh");
			hm.put(5,  "Hariharan");
			hm.put(6,  "Manjula");
			
			System.out.println(hm.get(1));
			
			hm.remove(2);
			hm.keySet();
			System.out.println(hm.keySet());
			
				
	Set<Integer> s = hm.keySet();
	Iterator<Integer> it = s.iterator();
		
		
	while (it.hasNext()) {
		int key = it.next();
		String value = hm.get(key);
		System.out.println(key + " " + value);
	}
}
}