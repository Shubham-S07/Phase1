import java.util.LinkedHashSet;

public class LinkedHashSetEX {
public static void main(String[] args) {
	LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("Sova");
		set.add("Jett");
		set.add("Raze");
		//set.add(null);
		set.add("Omen");
		set.add(null);
		set.add(null);
		for(String elem : set) {
			System.out.println(elem);	
			}
		}
}
