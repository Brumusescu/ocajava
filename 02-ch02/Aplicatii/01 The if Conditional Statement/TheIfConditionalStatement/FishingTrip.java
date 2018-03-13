public class FishingTrip {
    public static void main(String[] args) {
        boolean isFisherman = true;
        boolean isFishingTrip = false;
        
        if (isFisherman)
            isFishingTrip = true;
            
        System.out.println(isFishingTrip);
        
        int fishermen = 2;
        isFishingTrip = false;
        
        if (fishermen >= 1) {
            isFishingTrip = true;
            System.out.println("Going fishing!");
        }
            
        isFisherman = false;
        
        if (isFisherman)
            System.out.println("Going fishing!");
        else 
            System.out.println("I am doing anything but fishing");
    }
}