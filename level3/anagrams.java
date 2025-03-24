import java.util.Scanner;
import java.util.Arrays;
public class anagrams{
	public static boolean isAnagram(String str1, String str2){
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		if(str1.length() != str2.length()){
			return false;
		}
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for(char c: str1.toCharArray()){
			if(Character.isLetter(c)){
				freq1[c - 'a']++;
			}
		}
		for(char c: str2.toCharArray()){
			if(Character.isLetter(c)){
				freq2[c - 'a']++;
			}
		}
		for(int i=0; i<26; i++){
			if(freq1[i] != freq2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text1: ");
		String text1 = scan.nextLine();
		System.out.print("Enter text2: ");
		String text2 = scan.nextLine();
		if(isAnagram(text1, text2)){
			System.out.println("They're anagrams");
		}else{
			System.out.println("They're not anagrams");
		}
		scan.close();
	}
}