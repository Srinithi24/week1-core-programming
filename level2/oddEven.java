import java.util.Scanner;
class oddEven{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		for(int i = 1; i <= num; i++){
			if(i % 2 == 0){
				System.out.println(i+" even");
			}
			else{
				System.out.println(i+" odd");
			}
		}
		scan.close();
	}
}