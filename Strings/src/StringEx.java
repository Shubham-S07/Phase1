public class StringEx {
	
	final String s ="";
	
	public void finalize() {
		
	}

	public static void main(String[] args) {
		
		String s1 = "Hello world";
		System.out.println(s1.length());
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(0,0));
		
		String s2 = s1.concat(" Java");
		System.out.println(s2);
		
		s2 += " Program";
		System.out.println(s2);
		
		System.out.println(s2.charAt(0));

		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		
		System.out.println(st1 == st2); 
		System.out.println(st1.equals(st2));
		
	
		System.out.println(st1.toUpperCase());
		
		System.out.println(st2.replace("H", "C"));
		
		String test = "Hello! Sir";
		
		String[] str = test.split("!");
	
	
		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append("Welcome ");
		sb.append("Sir! ");
		sb.append("07 ");
		
		
		System.out.println(sb.toString());
		
		
		String t1 = "Jett";
		String t2 = "jett";
				
		System.out.println(t1.equalsIgnoreCase(t2));
		
		String a1 = "Jett";
		
		String a2 = a1;
		
		System.out.println(a1 == a2);
	}	
}