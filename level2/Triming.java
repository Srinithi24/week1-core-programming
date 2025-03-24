import java.util.Scanner;
class Triming{
	public static String trimspace(String str){
		int startIndex = 0;
		int endIndex = str.length() -1;
		while(startIndex <= endIndex && str.charAt(startIndex) == ' '){
			startIndex += 1;
		}
		while(endIndex >= startIndex && str.charAt(endIndex) == ' '){
			endIndex -= 1;
		}
		StringBuilder trimedString = new StringBuilder();
		for(int i= startIndex; i<= endIndex; i++){
			trimedString.append(str.charAt(i));
		}
		return trimedString.toString();
	}
	public static boolean compare(String str1, String str2){
		return str1.equals(str2);
	}
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		String trimmed = text.trim();
		String trimspace = trimspace(text);
		boolean res = compare(trimspace, trimmed);
		System.out.print(res);
		
		scan.close();
	}
}