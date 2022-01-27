import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Sova");
		list.add("Jett");
		list.add("Omen");
		list.add("Sage");
		list.add("Omen");
		
	for(String value : list) {
	System.out.println(value);
		}
	}
}
