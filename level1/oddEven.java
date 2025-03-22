import java.util.Scanner;
class oddEven{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int size = (num/2) + 1;
		int[] odd = new int[size];
		int[] even = new int[size];
		int indexEven = 0;
		int indexOdd = 0;
		for(int i =1; i<= num; i++){
			if(i%2 == 0){
				even[indexEven] = i;
				indexEven ++;
			}
			else{
				odd[indexOdd] = i;
				indexOdd ++;
			}
		}
		System.out.print("Odd array: ");
		for(int i = 0; i< indexOdd; i++){
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		System.out.print("Even array: ");
		for(int i = 0; i< indexEven; i++){
			System.out.print(even[i]+" ");
		}
		scan.close();
	}
}