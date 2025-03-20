import java.util.Scanner;
class area{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base: ");
		float base = scan.nextFloat();
		float baseInch = base/2.54f;
		System.out.print("Enter the height: ");
		float height = scan.nextFloat();
		float heightInch =height/2.54f;
		float areaInCm = (1/2.0f) * height*base;
		float areaInInch = (1/2.0f) * heightInch *baseInch;
		System.out.println("Area of triangle in cm square: "+areaInCm);
		System.out.println("Area of triangle in inch square: "+areaInInch);
		
		
		scan.close();
	}
}