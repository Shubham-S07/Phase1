
public class LocalInnerClassExample {
	private String msg = "This Is a Local Inner Class Example.";

	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);			}
		}
		
		Inner innerObj = new Inner();
		innerObj.msg();
	}
		
	public static void main(String[] args) {
		LocalInnerClassExample demo = new LocalInnerClassExample();
		demo.display();
}
}