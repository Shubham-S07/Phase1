import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
	
	PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Sova");
		queue.add("Omen");
		queue.add("A");
		queue.add("Jett");
		queue.add("Z");
				
		System.out.println("........................");
		for(String value : queue) {
			System.out.println(value);
		}
		
		System.out.println("--------------------------------");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		System.out.println("----------------------");
		for(String value : queue) {
			System.out.println(value);
		}	
	}
}
