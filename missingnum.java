import java.util.*;
import java.util.ArrayList;
public class missingnum {
    public static void main(String[] args)
    {
        int[] array=new int[]{1,2,4,5,7,9,11,13};
        ArrayList<Integer> arrli= new ArrayList<>();
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]+1!=array[i+1])
            {
                arrli.add(array[i]+1);
            }
        }
        System.out.println(arrli);

    }
}
