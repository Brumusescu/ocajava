public class Example1
{
    public static void main(String [] args) {
        assignmentOperators();
        compoundAssignmentOperators();
    }
    
    public static void assignmentOperators() {
        System.out.println("Assignment operators:");
        int goldCoins = 0;
        int pirateShips = 0;
        
        goldCoins = goldCoins + 99;
        System.out.println("goldCoins = " + goldCoins);
        
        pirateShips = pirateShips - 1;
        System.out.println("pirateShips = "+ pirateShips);
    }
    
    public static void compoundAssignmentOperators() {
        System.out.println("Compound assignment operators:");
        int goldCoins = 0;
        int pirateShips = 0;
        
        goldCoins += 99;
        System.out.println("goldCoins = " + goldCoins);
        
        pirateShips -= 1;
        System.out.println("pirateShips = "+ pirateShips);
    }
}
