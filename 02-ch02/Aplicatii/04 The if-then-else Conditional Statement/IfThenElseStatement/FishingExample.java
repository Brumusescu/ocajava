public class FishingExample
{
    private static FishingSession fishingSession = new FishingSession();
    
    public static void castForFish() {
        fishingSession.setCatch();
        String resultOfCast = fishingSession.getCastResult();

        if (resultOfCast.equals("fish")) {
            Fish keeperFish = new Fish();
            keeperFish = fishingSession.getFishResult();
            String type = keeperFish.getTypeOfFish();
            System.out.println("Wahoo! Keeper fish: " + type);
        }
        else {
            if (resultOfCast.equals("shark")) {
                System.out.println("Need to throw this one back!");
            }
            else {
                if (resultOfCast.equals("skate")) {
                    System.out.println("Yuck, Leo can take this one off the hook!");
                }
                else {
                    System.out.println("Darn, no catch!");
                }
            }
        }
    }
    
    public static void main(String [] args) {
        castForFish();
    }
}
