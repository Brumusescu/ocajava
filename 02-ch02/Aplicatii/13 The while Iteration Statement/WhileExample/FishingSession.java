public class FishingSession {
    private String session;
    public int fishLimit;
    
    public void setSession (String session) {
        this.session = session;
    }
    
    public String getSession () {
        return (this.session);
    }
    
    public void castForFish() {
        fishLimit++;
    }
}