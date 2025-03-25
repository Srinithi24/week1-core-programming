import java.util.Scanner;
class removeChar{
	public static String remove(String str, String l){
		StringBuilder res = new StringBuilder();
		char let = l.charAt(0);
		for(int i=0; i< str.length(); i++){
			char ch = str.charAt(i);
			if(ch != let){
				res.append(ch);
			}
		}
		return res.toString();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = scan.nextLine();
		System.out.println("Enter the Character to be removed: ");
		String letter = scan.nextLine();
		String result = remove(text, letter);
		System.out.println(result);
	}
}