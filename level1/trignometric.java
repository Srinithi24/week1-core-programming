import java.util.Scanner;

class trignometric{
	public static double[] calculateTrigonometricFunctions(double angle) {
		double radian = Math.toRadians(angle);
		double sineTheta = Math.sin(radian);
		double cosTheta = Math.cos(radian);
		double tanTheta = Math.tan(radian);
		return new double[] {sineTheta, cosTheta, tanTheta};
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the angle: ");
		double angle = scan.nextDouble();
		double[] res = calculateTrigonometricFunctions(angle);
		System.out.println("Sine: "+res[0]);
		System.out.println("Cosine : "+res[1]);
		System.out.println("Tangent : "+res[2]);
		scan.close();
	}
}