public class Example1
{
    public static void main(String[] args) {
        activitiesByDay();
    }
    
    public static void activitiesByDay() {
        int totalDaysCamping = 0;
        int daysAllowedFishing = 5;
        
        for (int i = 0; i < 8; ++i) {
            System.out.println();
            System.out.print("\nDay " + i + ": camping ");
            totalDaysCamping++;
            if (totalDaysCamping > daysAllowedFishing)
                continue;
            System.out.print("and fishing");
        }
    }
}
