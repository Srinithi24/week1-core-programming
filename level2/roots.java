import java.util.Scanner;
public class roots{
	public double[] findRoot(double a, double b, double c){
		double delta = Math.pow(b, 2) - (4 * a * c);
		if(delta>0){
			double root1 = (-b + Math.sqrt(delta))/(2*a); 
			double root2 = (-b - Math.sqrt(delta))/(2*a); 
			return new double[] {root1, root2};
		}
		else if(delta == 0){
			double root = -b/(2*a);
			return new double[]{root};
		}
		else{
			return new double[]{};
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextDouble();
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter c: ");
		double c = scan.nextDouble();
		roots obj = new roots();
		double[] res = obj.findRoot(a, b, c);
		if(res.length == 2){
			System.out.println(res[0]);
			System.out.println(res[1]);
		}
		else if(res.length == 1){
			System.out.println(res[0]);
		}
		else{
			System.out.println("No roots");
		}
		
		scan.close();
	}
}