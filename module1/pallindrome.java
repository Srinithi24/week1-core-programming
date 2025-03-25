import java.util.Scanner;
class pallindrome{
	public static boolean pallindromeCheck(String str){
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.nextLine();
		boolean res = pallindromeCheck(text);
		if(res){
			System.out.println("Pallindrome ");
		}else{
			System.out.println("Not a Pallindrome ");
		}
	}
}