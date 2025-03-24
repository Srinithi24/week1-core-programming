import java.util.Scanner;
public class CharacterFrequency{
	public static char[] uniqueCharacters(String str){
		String temp = "";
		for(int i=0; i< str.length(); i++){
			char current = str.charAt(i);
			if(temp.indexOf(current) == -1){
				temp += current;
			}
		}
		return temp.toCharArray();
	}
	public static String[][] characterFrequency(String str, char[] uniqueChars){
		int[] freq = new int[256];
		for(int i=0; i<str.length(); i++){
			char current = str.charAt(i);
			freq[current]++;
		}
		String[][] result = new String[uniqueChars.length][2];
		for(int i=0; i<uniqueChars.length; i++){
			char c = uniqueChars[i];
			result[i][0] = String.valueOf(c);
			result[i][1] = String.valueOf(freq[c]);
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = scan.nextLine();
		char[] uniqueCharacters = uniqueCharacters(text);
		String[][] frequency =  characterFrequency(text, uniqueCharacters);
		for(String[] entry: frequency){
			System.out.println(entry[0] +" : "+entry[1]);
		}
		scan.close();
	}
}