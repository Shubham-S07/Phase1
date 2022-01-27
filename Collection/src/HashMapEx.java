import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(01, "Sage");
		map.put(02, "KJ");
		map.put(03, "Jett");
	
		Set<Entry<Integer, String>> data = map.entrySet();

		Iterator<Entry<Integer,String>> itr = data.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer,String> entry =  itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}	
	}
}
