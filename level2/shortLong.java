import java.util.Scanner;
import java.util.ArrayList;
class shortLong{
	public static String[] splitWords(String text){
		String[] words = new String[100];
		int wordCount = 0;
		StringBuilder word = new StringBuilder();
		for(int i = 0; i <getStringLength(text); i++){
			char ch = text.charAt(i);
			if(Character.isLetter(ch) || ch == '\''){
				word.append(ch);
			}else{
				if(getStringLength(word.toString()) >0){
					words[wordCount++] = word.toString();
					word.setLength(0);
				}
			}
		}
		if(getStringLength(word.toString()) > 0){
			words[wordCount++] = word.toString();
		}
		String[] finalWords = new String[wordCount];
		System.arraycopy(words,0,finalWords,0, wordCount);
		return finalWords;
	}
	public static int getStringLength(String str){
		int count =0;
		for(char ch: str.toCharArray()){
			count++;
		}
		return count;
	}
	public static String[][] wordWithLength(String[] words){
		String[][] wordLength = new String[words.length][2];
		for(int i=0; i<words.length; i++){
			wordLength[i][0] = words[i];
			wordLength[i][1] = String.valueOf(getStringLength(words[i]));
		}
		return wordLength;
	}
	public static int[] minMax(String[][] wordWithLength){
		int minIndex = 0;
		int maxIndex = 0;
		int minLength = Integer.parseInt(wordWithLength[0][1]);
		int maxLength = Integer.parseInt(wordWithLength[0][1]);
		for(int i=1 ; i < wordWithLength.length; i++){
			int length = Integer.parseInt(wordWithLength[i][1]);
			if(length < minLength){
				minLength = length;
				minIndex = i;
			}else if(length > maxLength){
				maxLength = length;
				maxIndex = i;
			}
		}
		return new int[]{minIndex, maxIndex};
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		String[] words = splitWords(text);
		String[][] wordWithLength = wordWithLength(words);
		int[] res = minMax(wordWithLength);
		System.out.println("Words and its length");
		for(String[] wordPair : wordWithLength){
			System.out.println(wordPair[0]+ " has length of " + wordPair[1]);
		}
		
		System.out.println("Minimum: "+ wordWithLength[res[0]][0]);
		System.out.println("Maximum: "+ wordWithLength[res[1]][0]);
		scan.close();
	}
}