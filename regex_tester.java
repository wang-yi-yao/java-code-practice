import java.util.regex.*;

public class regex_tester {
	public static void isValidString(String inputStr) {
		String regExpStr = "[a-zA-Z0-9|\\s]++"; //complete this
		System.out.println("Your pattern construct: " + regExpStr);
		System.out.println("Your string entered: " + inputStr);
		Pattern pattern = Pattern.compile(regExpStr);
		Matcher matcher = pattern.matcher(inputStr);
		System.out.printf("%s\n", matcher.matches()? inputStr + ": matches": inputStr + ": does not match");
		System.out.println("");
	}
	
	public static void isValidCapsAtStart(String inputStr) {
		String regExpStr = "([A-Z0-9][a-zA-Z0-9]+\\s)*([A-Z0-9][a-zA-Z0-9]+)"; //complete this
		System.out.println("Your pattern construct: " + regExpStr);
		System.out.println("Your string entered: " + inputStr);
		Pattern pattern = Pattern.compile(regExpStr);
		Matcher matcher = pattern.matcher(inputStr);
		System.out.printf("%s\n", matcher.matches()? inputStr + ": matches": inputStr + ": does not match");
		System.out.println("");
	}
	
	public static void isValidSentence(String inputStr) {
		String regExpStr = "([a-zA-Z0-9][a-zA-Z0-9]+\\s)*([a-zA-Z0-9][a-zA-Z0-9]+\\.)"; //complete this
		System.out.println("Your pattern construct: " + regExpStr);
		System.out.println("Your string entered: " + inputStr);
		Pattern pattern = Pattern.compile(regExpStr);
		Matcher matcher = pattern.matcher(inputStr);
		System.out.printf("%s\n", matcher.matches()? inputStr + ": matches": inputStr + ": does not match");
		System.out.println("");
	}
	
	public static void findSpecificWord(String regExpStr, String inputStr) {
		System.out.println("Your keyword: " + regExpStr);
		System.out.println("Your string entered: " + inputStr);
		Pattern pattern = Pattern.compile(regExpStr);
		Matcher matcher = pattern.matcher(inputStr);
		System.out.printf("%s\n", matcher.find()? inputStr + ": Found": inputStr + ": Not Found");
		System.out.println("");
	}
	
	public static void isDigitalOnly(String inputStr) {
		String regExpStr = "(\\d+)\\s*(\\d+)"; //complete this
		System.out.println("Your pattern construct: " + regExpStr);
		System.out.println("Your string entered: " + inputStr);
		Pattern pattern = Pattern.compile(regExpStr);
		Matcher matcher = pattern.matcher(inputStr);
		System.out.printf("%s\n", matcher.matches()? inputStr + ": matches": inputStr + ": does not match");
		System.out.println("");
	}

	public static void main(String[] args) {
		isValidString("Hello World");
		isValidString("The time is January 1 1970");
		isValidCapsAtStart("for Whom The Bell Tolls");
		isValidCapsAtStart("For Whom The Bell Tolls");
		isValidSentence("The quick brown fox jumps over the lazy dog.");
		findSpecificWord("sus", "Among Us is a very sus video game, do not play it.");
		findSpecificWord("Auckland", "123 Kauri Street, Whangarei, Northland, New Zealand");
		isDigitalOnly("1001 4444");
	}
}
