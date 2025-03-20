import java.util.Scanner;
class travelComputation { 
   public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = scan.nextLine();
		System.out.print("Travel from city: ");
		String fromCity = scan.nextLine();
		System.out.print("Travel via city: ");
		String viaCity = scan.nextLine();
		System.out.print("Travel to city: ");
		String toCity = scan.nextLine();
		System.out.print("Enter the disatnce from "+fromCity+" to "+viaCity +" :");
		double distanceFromToVia = scan.nextDouble();
		System.out.print("Enter the time from "+fromCity+" to "+viaCity+" :");
		int timeFromToVia = scan.nextInt();
		System.out.print("Enter the disatnce from "+viaCity+" to "+toCity+" :");
		double distanceViaToFinalCity = scan.nextDouble();
		System.out.print("Enter the time from "+viaCity+" to "+toCity+" :");
		int timeViaToFinalCity = scan.nextInt();
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		int totalTime = timeFromToVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");
		scan.close();
   }
}
