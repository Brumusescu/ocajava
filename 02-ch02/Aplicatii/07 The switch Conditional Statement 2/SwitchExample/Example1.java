import java.util.Random;

public class Example1
{
    public static String generateRandomFish() {
        String randomFish;
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(4);
        
        switch (randomNumber) {
            case 0:
                randomFish = "Blue Fish";
                break;
            case 1:
                randomFish = "Ren Drum";
                break;
            case 2:
                randomFish = "Striped Bass";
                break;
            default:
                randomFish = "Unknown Fish Type";
                break;
        }
        
        return randomFish;
    }
    
    public static void main(String[] args) {
        System.out.println(generateRandomFish());
    }
}
