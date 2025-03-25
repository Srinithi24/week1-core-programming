import java.util.Scanner;
class mostFrequent{
	public static char frequentChar(String str){
		int[] freq = new int[256];
		char mostFrequent = ' ';
		int maxCount = 0;
		for(int i=0; i< str.length(); i++){
			char ch = str.charAt(i);
			freq[ch]++;
			if(freq[ch] > maxCount || (freq[ch] == maxCount && ch < mostFrequent)){
				mostFrequent = ch;
				maxCount = freq[ch];
			}
		}
		return mostFrequent;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = scan.nextLine();
		char res = frequentChar(text);
		System.out.println("Most frequent character: "+ res);
		scan.close();
	}
}