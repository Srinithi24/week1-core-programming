import java.util.Scanner;
class subString{
	public static String substring(String text, int start, int end){
		StringBuilder res = new StringBuilder();
		for(int i= start; i<end; i++){
			res.append(text.charAt(i));
		}
		return res.toString();
	}
	public static boolean comparision(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i =0; i<str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = scan.next();
		scan.nextLine();
		System.out.println("Enter a starting index: ");
		int num1 = scan.nextInt();
		System.out.println("Enter a ending index: ");
		int num2 = scan.nextInt();
		
		String manual = substring(text, num1, num2);
		String builtIn = text.substring(num1, num2);
		System.out.println("Manual substring: "+ manual);
		System.out.println("Built-In substring: "+ builtIn);
		System.out.println("Comparing 2 substrings: "+ comparision(manual, builtIn));
		scan.close();
	}
}