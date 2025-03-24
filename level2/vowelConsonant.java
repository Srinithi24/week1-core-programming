import java.util.Scanner;
class vowelConsonant{
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
	public static int[] count(String str){
		int vowelCount =0;
		int consonantCount = 0;
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			String res = checkChar(ch);
			if(res.equals("vowel")){
				vowelCount++;
			}else{
				consonantCount++;
			}
		}
		return new int[]{vowelCount, consonantCount};
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		int[] counts = count(text);
		System.out.println("vowel count: "+counts[0]);
		System.out.println("consonant count: "+counts[1]);
		scan.close();
	}
}