import java.util.Scanner;
class factors{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int maxFactor = 10;
		int index = 0;
		int[] factors = new int[maxFactor];
		for(int i = 1; i<=num; i++){
			if(num%i ==0){
				if(index == maxFactor){
					maxFactor *= 2;
					int[] temp = new int[maxFactor];
					for(int j=0; j<index; j++){
						temp[j] = factors[j];
					}
					factors = temp;
				}
				factors[index] = i;
				index ++;
				
			}
			
		}
		System.out.println("The factors are: ");
		for(int i = 0; i< index; i++){
			System.out.print(factors[i]+" ");
		}
		scan.close();
	}
}