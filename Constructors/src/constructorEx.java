
class Vehicle {
	
	private int id;
	private String s;
	
	static String s2;
	
	Vehicle(int id, String s) {
		
		this.id = id;
		this.setS(s);
		System.out.println("Constructor is invoked");
	}
	
	public int getId() {
		return this.id;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}	
}

class A {	
	A() {
		super();
		System.out.println("A invoked");
	}
}
class B  extends A {
	public B() {
		super();
		System.out.println("B invoked");
	}
}

class EmpInfo {
	
	int id ;
	String name;
	
	void display() {
		int a = 5;
		System.out.println(this.id+" "+this.name);
	}
	
	public EmpInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

public class constructorEx {

	public static void main(String[] args) {
		EmpInfo empInfo = new EmpInfo(7, "Michael");
		
		empInfo.display();
			B b = new B();
		
		
	}
}