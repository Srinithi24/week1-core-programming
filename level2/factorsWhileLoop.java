import java.util.Scanner;
class factorsWhileLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int i = 1;
		while(i<=num){
			if(num%i ==0){
				System.out.println(i);
				
			}
			i++;
		}
		scan.close();
	}
}