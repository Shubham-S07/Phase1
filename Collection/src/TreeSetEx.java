import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		set.add("Sova");
		set.add("Jett");
		set.add("Sage");
		set.add("Raze");
		
		for(String elem : set) {
			System.out.println(elem);
		}
		
		

	}

}