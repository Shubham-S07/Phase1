
	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArrayListEx {

		public static void main(String[] args) {
			
			
			ArrayList<String> list = new ArrayList<>();
			
			list.add("Sage");
			list.add("Jett");
			list.add("Omen");
			list.add("Pheonix");
			list.add("KJ");
			
			Iterator<String> itr = list.iterator();
			
			while(itr.hasNext()) {
			String value = itr.next();
				System.out.println(value);
			}
			
			for(String value : list) {
				
				System.out.println(value);
			}
		}

	}
