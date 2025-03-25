import java.util.Scanner;
class lexicographical{
	public static int compare(String str1, String str2){
		int length1 = str1.length();
		int length2 = str2.length();
		int minlength = Math.min(length1, length2);
		for(int i=0; i<minlength; i++){
			if(str1.charAt(i) < str2.charAt(i)){
				return -1;
			} else if(str1.charAt(i) > str2.charAt(i)){
				return 1;
			}
		}
		if(length1 < length2){
			return -1;
		}else if(length2 < length1){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first text: ");
		String text1 = scan.nextLine();
		System.out.print("Enter the second text: ");
		String text2 = scan.nextLine();
		int result = compare(text1, text2);
		 if (result < 0) {
            System.out.println("\"" + text1 + "\" comes before \"" + text2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + text1 + "\" comes after \"" + text2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
		}
	}
}