
public class staticInnerClass {

	static int data = 7;
	
	static class Inner {
		void msg() {
			System.out.println("Static Inner Class Example "+data);
		}
	}
	public static void main(String[] args) {
		
		staticInnerClass.Inner ob = new staticInnerClass.Inner();
		//StaticInnerClassExample.data;
		ob.msg();		
}
}