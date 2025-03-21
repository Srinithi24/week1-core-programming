import java.util.Scanner;
class oddEven{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int i = 1;
		while(i <= num){
			if(i % 2 == 0){
				System.out.println(i +" even");
			}
			else{
				System.out.println(i +" odd");
			}
			i += 1;
		}
		scan.close();
	}
}