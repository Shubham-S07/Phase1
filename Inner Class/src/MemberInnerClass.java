
public class MemberInnerClass {
	private String msg = "Hello! ";
	
	class Inner {
		void hello() {
			System.out.println(msg+"This Is A Member Class");
		}
	}
	
	
	public static void main(String[] args) {
		 
		MemberInnerClass outer = new MemberInnerClass();
		
		MemberInnerClass.Inner innerObj = outer.new Inner();
		innerObj.hello();
	}
	
}
