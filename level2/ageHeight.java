import java.util.Scanner;
class ageHeight{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the age of Amar: ");
		int amarAge = scan.nextInt();
		System.out.print("Enter the age of Akbar: ");
		int akbarAge = scan.nextInt();
		System.out.print("Enter the age of Anthony: ");
		int anthonyAge = scan.nextInt();
		System.out.print("Enter the height of Amar: ");
		double amarHeight = scan.nextDouble();
		System.out.print("Enter the height of Akbar: ");
		double akbarHeight = scan.nextDouble();
		System.out.print("Enter the height of Anthony: ");
		double anthonyHeight = scan.nextDouble();
		if(amarAge < akbarAge && amarAge < anthonyAge){
			System.out.println("Amar is youngest");
		}
		else if(akbarAge < amarAge && akbarAge < anthonyAge){
			System.out.println("Akbar is youngest");
		}
		else{
			System.out.println("Anthony is youngest");
		}
		
		if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
			System.out.println("Amar is tallest");
		}
		else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
			System.out.println("Akbar is tallest");
		}
		else{
			System.out.println("Anthony is tallest");
		}
	}
}