public class Example1
{
    public static void main(String[] args) {
        int greyCannonBalls = 50;
        int blackCannonBalls = 50;
        
        int totalCannonBalls = greyCannonBalls + blackCannonBalls;
        System.out.println(greyCannonBalls + " + " + blackCannonBalls + " = " + totalCannonBalls);
        
        int firedCannonBalls = 10;
        totalCannonBalls = totalCannonBalls - firedCannonBalls;
        System.out.println((totalCannonBalls + firedCannonBalls) + " - " + firedCannonBalls + " = " + totalCannonBalls);

        int matches = 20;
        int matchboxes = 20;
        int totalMatches = matches * matchboxes;
        System.out.println(matches + " * " + matchboxes + " = " + totalMatches);
        
        int pirates = 104;
        int pirateShips = 3;
        int assignedPiratesPerShip = pirates / pirateShips;
        System.out.println(pirates + " / " + pirateShips + " = " + assignedPiratesPerShip);
        
        int pirateRemainder = pirates % pirateShips;
        System.out.println(pirates + " % " + pirateShips + " = " + pirateRemainder);
    }
}
