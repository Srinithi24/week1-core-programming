import java.util.Scanner;
class pallindrome{
	public static String rev(String text){
		StringBuilder result = new StringBuilder();
		for(int i=text.length()-1; i>=0; i--){
			result.append(text.charAt(i));
		}
		return result.toString();
	}
	public static boolean pallindromeCheck(String text, String result){
		return text.equals(result);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = scan.nextLine();
		System.out.print("Reversed text: ");
		String res = rev(text);
		System.out.println(res);
		boolean palin = pallindromeCheck(text, res);
		if(palin){
			System.out.println("It is pallindrome");
		}
		else{
			System.out.println("Not a pallindrome");
		}
		scan.close();
	}
}