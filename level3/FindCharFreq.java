import java.util.Scanner;
public class FindCharFreq{
	public static String[] findCharacterFrequency(String str){
		char[] characters = str.toCharArray();
		int[] frequency = new int[characters.length];
		for(int i=0; i<frequency.length; i++){
			frequency[i]= 1;
		}
		for(int i=0; i<characters.length; i++){
			if(characters[i] == '0'){
				continue;
			}
			for(int j=i+1; j<characters.length;j++){
				if(characters[i] == characters[j]){
					frequency[i]++;
					characters[j] = '0';
				}
			}
		}
		int uniqueCount = 0;
		for(char c: characters){
			if(c!='0'){
				uniqueCount++;
			}
		}
		String[] result = new String[uniqueCount];
		int index = 0;
		for(int i=0; i<characters.length; i++){
			if(characters[i] != '0'){
				result[index++] = characters[i] +" : "+frequency[i];
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = scan.nextLine();
		String[] frequencies = findCharacterFrequency(text);
		for(String freq : frequencies){
			System.out.println(freq);
		}
		scan.close();
	}
}