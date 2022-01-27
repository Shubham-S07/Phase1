	import java.util.ArrayDeque;
	import java.util.Iterator;


	public class arrDequeueEx extends Object {

		public static void main(String[] args) {
			
			ArrayDeque<String> dqueue = new ArrayDeque<>();
			dqueue.add("Dwight");
			dqueue.add("Jim");
			dqueue.add("Pam");
			dqueue.add("Ryan");
			dqueue.offer("Jake");
			dqueue.offerFirst("Raze");
			dqueue.addFirst("Sova");

			for(String value : dqueue) {
				System.out.println(value);
			}
			
			System.out.println("\n-------------\n");
			
			System.out.println(dqueue.pollLast());
		}
	}
