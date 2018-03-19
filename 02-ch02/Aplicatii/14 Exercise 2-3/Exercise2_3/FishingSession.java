public class FishingSession
{
    private String session;
    private int piecesOfBait;
    private int fishes = 0;
    private boolean baitAvailability;
    
    public void setSession(String session) {
        this.session = session;
    }
    
    public String getSession() {
        return this.session;
    }
    
    public void getMoreBait() {
        this.piecesOfBait += 10;
    }
    
    public int getPiecesOfBait() {
        return this.piecesOfBait;
    }
    
    public boolean isBaitAvailable(){
        if (this.piecesOfBait > 0)
            return true;
        return false;
    }
        
    public boolean getBaitAvailability(){
        return this.baitAvailability;
    }
    
    public void foxStealsBait() {
        this.piecesOfBait = 0;
    }
    
    public void castForFish() {
        this.piecesOfBait--;
        this.fishes++;
        
        System.out.println("Pieces of Bait: " + this.piecesOfBait);
        System.out.println("Fishes: " + this.fishes);
    }
    
    public int getFishes(){
        return this.fishes;
    }
}
