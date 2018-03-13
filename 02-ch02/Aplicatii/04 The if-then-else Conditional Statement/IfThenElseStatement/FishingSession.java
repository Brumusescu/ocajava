import java.util.Random;

public class FishingSession
{
    private Fish fish;
    private String fishCatch;
    
    enum FISHES {
        FISH, SHARK, SKATE;
        
        public static FISHES getRandomFish() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    };
    
    public void setCatch(){
        FISHES randomFish = FISHES.getRandomFish();
        switch(randomFish) {
            case FISH:
                fishCatch = "fish";
                break;
            case SHARK:
                fishCatch = "shark";
                break;
            case SKATE:
                fishCatch = "skate";
                break;
        }
    }
    
    public String getCastResult() {
        return this.fishCatch;
    }
    
    public Fish getFishResult() {
        this.fish = new Fish();
        this.fish.setTypeOfFish(getCastResult());
        return this.fish;
    }
}
