import java.util.Scanner;
import java.util.Arrays;
class anagrams{
	public static boolean anagramCheck(String str1, String str2){
		char[] arrayStr1 = str1.toCharArray();
		char[] arrayStr2 = str2.toCharArray();
		Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);
        return Arrays.equals(arrayStr1, arrayStr2);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text1: ");
		String text1 = scan.nextLine();
		System.out.println("Enter text2: ");
		String text2 = scan.nextLine();
		boolean res = anagramCheck(text1, text2);
		if(res){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("Not Anagrams");
		}
		scan.close();
	}
}