import java.util.Scanner;
class SubstringOccurances{
	public static int occurances(String str, String substr){
		int count = 0;
		int index = 0;
		while(index < str.length()){
			int foundIndex = str.indexOf(substr, index);
			if(foundIndex != -1){
				count++;
				index = foundIndex+1;
			}else{
				break;
			}
		}return count;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		System.out.print("Enter the substring: ");
		String substring = scan.nextLine();
		int res = occurances(text, substring);
		System.out.println(res);
	}
}