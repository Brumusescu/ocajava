import java.util.List;
import java.util.ArrayList;

public class Exercise2_2
{
    public static void main(String[] args){
        List<Float> fishLengthList = new ArrayList<>();
        fishLengthList.add(10.0f);
        fishLengthList.add(15.5F);
        fishLengthList.add(18.0F);
        fishLengthList.add(29.5F);
        fishLengthList.add(45.5F);
        
        for (Float length : fishLengthList) {
            if (length >= 28) {
                System.out.println("Stripped bass length: " + length);
            }
        }
    }
}
