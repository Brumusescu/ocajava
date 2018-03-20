public class Example1
{
    public static void main (String[] args) {
        fishingHour1();
        System.out.println();
        fishingHour2();
    }
    
    public static void fishingHour1() {
        int totalHoursFishing = 0;
        int hoursAllowedFishing = 4;
        
        for (int i = 1; i < 25; i++) {
            totalHoursFishing = ++totalHoursFishing;
            System.out.println("Fishing for hour " + totalHoursFishing);
            
            if(totalHoursFishing > hoursAllowedFishing)
                break;
        }
    }
    
    public static void fishingHour2() {
        int totalHoursFishing = 0;
        int hoursAllowedFishing = 4;
        
        for (int i = 1; i < 25; i++) {
            totalHoursFishing = totalHoursFishing++; 
            System.out.println("Fishing for hour " + totalHoursFishing);
            
            if(totalHoursFishing > hoursAllowedFishing)
                break;
        }
    }
}
