
public class callMethod {

int v=150;

int operation(int v) {
	v =v*10/100;
	return(v);
}

public static void main(String args[]) {
	callMethod d = new callMethod();
	System.out.println("Before operation value of data is "+d.v);
	d.operation(100);
	System.out.println("After operation value of data is "+d.v);
	}
}