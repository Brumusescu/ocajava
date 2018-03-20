public class Example1
{
    public static void main (String[] args) {
        System.out.println("Total fish types: " + getTotalFishTypes(5, 8, 3));
        System.out.println("Total fish types: " + getTotalCaughtFish(15, 8));
    }
    
    public static int getTotalFishTypes(int saltWaterFishTotal, int freshWaterFishTotal, int brackishFishTotal) {
        int fishTypesTotal = saltWaterFishTotal + freshWaterFishTotal + brackishFishTotal;
        return fishTypesTotal;
    }
    
    public static int getTotalCaughtFish(int keeperFish, int throwBackFish) {
        return keeperFish + throwBackFish;
    }
}
