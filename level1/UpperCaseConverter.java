import java.util.Scanner;
class UpperCaseConverter{
	public static String manualUpperCase(String text){
		StringBuilder str = new StringBuilder();
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			if(ch >='a' && ch<='z'){
				str.append((char)(ch-32));
			}else{
				str.append(ch);
			}
		}
		return str.toString();
	}
	public static boolean compare(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i= 0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String text = scan.nextLine();
		String manual = manualUpperCase(text);
		String builtIn = text.toUpperCase();
		boolean same = compare(manual, builtIn);
		System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Same? " + same);
        
        scan.close();
		
	}
}