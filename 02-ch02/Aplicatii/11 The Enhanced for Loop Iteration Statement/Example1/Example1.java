import java.util.List;
import java.util.ArrayList;

public class Example1
{
    public static void main(String[] args){
        int hookSizes[] = {1, 1, 1, 2, 2, 4, 5, 5, 5, 6, 7, 8, 8, 9};
        
        for (int hook : hookSizes) {
            System.out.print(hook + " ");
        }
        System.out.println();
        
        List<Integer> hookSizesList = new ArrayList<>();
        hookSizesList.add(1);
        hookSizesList.add(4);
        hookSizesList.add(5);
        
        for(Integer hook: hookSizesList)
            System.out.print(hook + " ");
        System.out.println();
    }
}
