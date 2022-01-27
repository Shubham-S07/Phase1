import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		
		System.out.println(Pattern.matches("[a-z]+", "killjoy"));
		
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "KillJoy@simplilean.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "KillJoy#simplilean.com"));
	}

}
