import java.util.*;
import java.util.Map.Entry;
public class mapsEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Jim");    
	      hm.put(2,"Dwight");    
	      hm.put(3,"Andy");   
	       
	      System.out.println("\n The elements of Hashmap are ");  
	      for (Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	      
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Pam");  
	      ht.put(5,"Angela");  
	      ht.put(6,"Erin");  
	      ht.put(7,"Creed");  

	      System.out.println("\n The elements of HashTable are ");  
	      for (Iterator<Entry<Integer, String>> iterator = ht.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> n = iterator.next();
			System.out.println(n.getKey()+" "+n.getValue());
		}
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Michael");    
	      map.put(9,"Stanley");    
	      map.put(10,"Kevin");      
	      map.put(11,"Ryan");
	      
	      System.out.println("\n The elements of Treemap are ");  
	      for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> l = iterator.next();
			System.out.println(l.getKey()+" "+l.getValue());
		}    
	      
	   }  
}
