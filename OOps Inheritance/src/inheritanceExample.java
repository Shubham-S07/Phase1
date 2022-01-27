
class Employee {
	float salary = 25000;
}

class Programmer extends Employee {
	int bonus = 11000;
	
	public void printSalary() {
		System.out.println("Base salary (From parent)"+ salary);
		System.out.println(bonus);
	}
}

public class inheritanceExample{

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.printSalary();
	}
}
