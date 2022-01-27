interface TestAbstractClass {
	 void display();
}


public class AnonymousInnerClass {
	public static void main(String[] args) {
		TestAbstractClass obj = new TestAbstractClass() {
	
			public void display() {
				System.out.println("This Is an Anonymous Inner Class Example.");
						}
};
	obj.display();
	}
}