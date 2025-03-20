class volumeOfEarth {
    public static void main(String[] args) {
        double pi = Math.PI;
        int kilometerRadius = 6378;
        double mileRadius = 0.6 * (double) 6378;
        double kilometerVolume = (4.0 / 3.0) * pi * Math.pow(kilometerRadius, 3);	
		double mileVolume = (4.0 / 3.0) * pi * Math.pow(mileRadius, 3);


        System.out.println("The volume of Earth in cubic kilometers is " + kilometerVolume + " and in cubic miles is " + mileVolume);
    }
}
