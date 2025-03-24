import java.util.Scanner;
class pallindrome{
	public static boolean pallindromeIterative(String str){
		int start = 0;
		int end = str.length()-1;
		while(start < end){
			if(str.charAt(start) != str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static boolean pallindromeRecursive(String str, int start, int end){
		if(start >= end){
			return true;
		}
		if(str.charAt(start) != str.charAt(end)){
			return false;
		}
		return pallindromeRecursive(str, start+1, end-1);
	}
	public static boolean pallindromeArray(String str){
		char[] original = str.toCharArray();
		char[] reversed = new char[original.length];
		for(int i=0; i<original.length; i++){
			reversed[i] = original[original.length-1-i];
		}
		for(int i=0; i<original.length;i++){
			if(original[i] != reversed[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = scan.nextLine();
		boolean res1 = pallindromeIterative(text);
		boolean res2 = pallindromeRecursive(text, 0,text.length()-1);
		boolean res3 = pallindromeArray(text);
		System.out.println("iterative: "+ (res1? "pallindrome" : "not a pallindrome"));
		System.out.println("recursive: "+ (res2? "pallindrome" : "not a pallindrome"));
		System.out.println("array: "+ (res3? "pallindrome" : "not a pallindrome"));
		scan.close();
	}
}