import java.util.Scanner;
class  NumberFormat{
	public static int generateException(String text){
		return Integer.parseInt(text);
	}
	public static void error(String text){
		try{
			System.out.println(Integer.parseInt(text));
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException found");
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