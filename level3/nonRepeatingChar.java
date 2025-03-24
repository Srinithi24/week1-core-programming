import java.util.Scanner;
class nonRepeatingChar{
	public static char firstNonRepeatingChar(String str){
		int[] freq = new int[256];
		for(int i=0; i < str.length(); i++){
			freq[str.charAt(i)]++;
		}
		for(int i=0; i<str.length(); i++){
			if(freq[str.charAt(i)] == 1){
				return str.charAt(i);
			}
		}return '\0';
	}
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = scan.nextLine();
		char result = firstNonRepeatingChar(text);
		if(result!= '\0'){
			System.out.print(result);
		}else{
			System.out.print("no result");
		}
		scan.close();
	}
	
}