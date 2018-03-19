public class WhileExample
{
    private static FishingSession fishingSession;
    private static final String ACTIVE = "active";
    private static final String INACTIVE = "inactive";
    
    public static void main(String[] args) {
        fishingSession.setSession("active");
        
        while (ACTIVE.equals(fishingSession.getSession())) {
            fishingSession.castForFish();
            if (fishingSession.fishLimit == 10) {
                fishingSession.setSession(INACTIVE);
            }
        }
    }
}
