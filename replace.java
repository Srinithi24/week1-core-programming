import java.util.Scanner;
class replace{
	public static String replace(String str, String rep, String w){
		return str.replace(rep, w);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = scan.nextLine();
		System.out.println("Enter the word to replace: ");
		String word = scan.nextLine();
		System.out.println("Enter the word replace: ");
		String words = scan.nextLine();
		String res = replace(text, word, words);
		System.out.println(res);
		scan.close();
	}
}