import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Comparator {
    public static void main (String [] args){

        List<Integer>nums = new ArrayList<>();

        Comparator<Integer>com = new Comparator<Integer>()
        {
            public int compare(Integer i , Integer j )
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        nums.add(1271);
        nums.add(102);
        nums.add(73);
        nums.add(9);
        nums.add(8111114);

            Collections.sort(nums , com);

        System.out.println(nums);


    }
}
