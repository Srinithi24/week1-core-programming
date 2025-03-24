
import java.util.Scanner;
class  ArrayIndexOutOfBounds{
	public static int generateException(String text){
		return names.length();
	}
	public static void error(String[] names){
		try{
			for(int i =0; i<= names.length(); i++){
				System.out.print(names[i] + " ");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException found");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String[] names = new String[5];
		for(int i =0; i<5; i++){
			names[i] = scan.next();
		}
		error(names);
		scan.close();
	}
}