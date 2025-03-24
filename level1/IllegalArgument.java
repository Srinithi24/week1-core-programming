import java.util.Scanner;
class  IllegalArgument{
	public static int generateException(String text){
		return text.length();
	}
	public static void error(String text, int start, int end){
		try{
			System.out.println(text.substring(start, end));
		}catch(IllegalArgumentException e){
			System.out.println("IllegalArgumentException  found");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		int start = 100;
		int end = 10;
		String text = scan.next();
		error(text, start, end);
		scan.close();
	}
}