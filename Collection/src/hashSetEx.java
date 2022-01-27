import java.util.HashSet;

public class hashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Sage");
		set.add("Jett");
		set.add("Sova");
		set.add("Raze");
		set.add("Omen");
		
		
		for(String elem : set) {
			System.out.println(elem);
	}
	}
}

