public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;   // radius in km
        double kmToMile = 0.621371;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMile;

        // Volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                           " and in cubic miles is " + volumeMiles3);
    }
}



