import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static <K, V> void main(String[] args) {
		// TODO Auto-generated method stub

		//Array List can have duplicate values
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(2);
		System.out.println(li);
		System.out.println(li.get(0));
		
		//Set  No Duplicate values
		
		Set<Integer> s = new HashSet<>();
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(4); //Duplicate 4 will be ignored.
		System.out.println(s);
		
		
		//Map no Duplicate Keys, but can have duplicate values
		Map<String, String> m = new HashMap<String, String>();
		m.put("FirstName", "Ravi");
		m.put("LastName", "Gajul");
		m.put("MiddleName", "Ravi");
		System.out.println(m);
		System.out.println(m.get("FirstName"));	
		
	}

}
