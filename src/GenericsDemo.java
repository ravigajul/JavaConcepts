import java.util.HashMap;
import java.util.Map;

public class GenericsDemo {

	public static void main(String[] args) {
		
		//Integer
		TestGenerics<Integer> tg = new TestGenerics<Integer>(10);
		System.out.println(tg.getObject());
		
		//String
		TestGenerics<String> tg1 = new TestGenerics<String>("This is a generic String");
		System.out.println(tg1.getObject());
		
		//Double
		TestGenerics<Double> tg2 = new TestGenerics<Double>(20.0);
		System.out.println(tg2.getObject());
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("FirstName", "Ravi");
		map.put("LastName", "Gajul");
		map.put("Email", "Ravi.Gajul@test.com");
		System.out.println(map);
		
	}
}
