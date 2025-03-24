import java.util.Scanner;
class  StringIndexOutOfBounds{
	public static int generateException(String text){
		return text.length();
	}
	public static void error(String text){
		try{
				System.out.println(text.charAt(100));
		}catch(StringIndexOutOfBoundsException e){
				System.out.println("StringIndexOutOfBoundsException found");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = scan.next();
		error(text);
		scan.close();
	}
}