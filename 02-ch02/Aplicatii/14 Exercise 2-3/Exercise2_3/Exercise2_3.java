public class Exercise2_3
{
    private static FishingSession fishingSession = new FishingSession();
    private static final String ACTIVE = "active";
    private static final String INACTIVE = "inactive";
    
    public static void main(String[] args) {
        fishingSession.setSession(ACTIVE);
        fishingSession.getMoreBait();
        fishingSession.foxStealsBait();
        
        do {
            if (fishingSession.getFishes() < 10) {
                fishingSession.castForFish();
                if (!fishingSession.isBaitAvailable()) {
                    fishingSession.getMoreBait();
                }
            }
            else {
                fishingSession.setSession(INACTIVE);
                break;
            }
        }
        while (fishingSession.getPiecesOfBait() != 0);
    }
}
