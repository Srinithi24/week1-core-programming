import java.util.Scanner;
class VowelConsonantChecker{
	public static String checkChar(char ch){
		ch = Character.toLowerCase(ch);
		if(ch >= 'a' && ch<='z'){
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				return "vowel";
			}else{
				return "consonant";
			}
		}return "not a letter"; 
	}
	public static String[][] checker(String str){
		String[][] res = new String[str.length()][2];
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			res[i][0] = Character.toString(ch);
			res[i][1] = checkChar(ch);
		}
		return res;
	}
	public static void display(String[][] res){
		System.out.println("Character | Type");
		for(String[] row: res){
			System.out.printf(" %s        |%s\n", row[0],row[1]);
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		String[][] checker = checker(text);
		display(checker);
		scan.close();
	}
}