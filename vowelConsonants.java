import java.util.Scanner;
class vowelConsonants{
	public static void count(String text){
		int vowelCount = 0;
		int consonantCount = 0;
		text = text.toLowerCase();
		for(int i= 0; i< text.length(); i++){
			char ch = text.charAt(i);
            if (Character.isLetter(ch)) { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
			}
		}
		System.out.println("Vowel Count: "+ vowelCount);
		System.out.println("Consonant Count: "+ consonantCount);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		count(text);
	}
}