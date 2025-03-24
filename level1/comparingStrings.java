import java.util.Scanner;
class comparingStrings{
	public static String userDefined(String text){
		StringBuilder res = new StringBuilder();
		for(int i= 0; i<text.length(); i++){
			res.append(text.charAt(i)).append(" ");
		}
		return res.toString().trim();
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
		
		
		String manual = userDefined(text);
		System.out.println("Manual : "+ manual);
		char[] builtIn = text.toCharArray();
		StringBuilder builtInString = new StringBuilder();
		for(char c: builtIn){
			builtInString.append(c).append(" ");
		}
		String builtInStr = builtInString.toString().trim();
		System.out.println("Built-In : "+ builtInStr);
		
		System.out.println("Comparing "+ comparision(manual, builtInStr));
		scan.close();
	}
}