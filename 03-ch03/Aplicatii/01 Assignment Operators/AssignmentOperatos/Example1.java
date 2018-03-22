public class Example1
{
    public static void main (String [] args) {
        correctAssignments();
    }
    
    public static void correctAssignments() {
        boolean hasTreasureChestKey = true;
        System.out.println("Has treasure chest key: " + hasTreasureChestKey);
        byte shipMates = 20;
        System.out.println("ship mates: " + shipMates);
        PirateShip ship = new PirateShip();
        System.out.println("ship: " + ship.toString());
    }
    
    /*public static void incorrectAssignments() {
        boolean hasTreasureChestKey = TRUE; // Invalid literal, TRUE must be lower case 
        System.out.println("Has treasure chest key: " + hasTreasureChestKey);
        System.out.println("ship mates: " + shipMates);
        byte shipMates = 500; // Invalid literal, byte value cannot exceed 127               
        PirateShip ship = new PirateShip(15);                //Invalid constructor               
        System.out.println("ship: " + ship.toString());
    }*/
}
