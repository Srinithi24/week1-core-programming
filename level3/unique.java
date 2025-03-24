import java.util.Scanner;
class unique{
	public static int getStringLength(String str){
		int len = 0;
		try{
			while(true){
				str.charAt(len);
				len++;
			}
		}catch(IndexOutOfBoundsException e){
			return len;
		}
	}
	public static char[] uniqueCharacters(String str){
		int strLength = getStringLength(str);
		char[] uniqueChars = new char[strLength];
		int uniqueCount = 0;
		for(int i=0; i<strLength; i++){
			char currentChar = str.charAt(i);
			boolean isUnique = true;
			for(int j=0; j< uniqueCount; j++){
				if(uniqueChars[j] == currentChar){
					isUnique = false;
					break;
				}
			}
			if(isUnique){
				uniqueChars[uniqueCount] = currentChar;
				uniqueCount++;
			}
		}
		char[] result = new char[uniqueCount];
		for(int i=0; i<uniqueCount; i++){
			result[i] = uniqueChars[i];
		}
		return result;
	}
	public static void display(char[] uniqueChars){
		System.out.println("Unique characters: ");
		for(char c: uniqueChars){
			System.out.print(c +" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = scan.nextLine();
		int len = getStringLength(text);
		char[] uniqueChars = uniqueCharacters(text);
		display(uniqueChars);
		scan.close();
	}
}