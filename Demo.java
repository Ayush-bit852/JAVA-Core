import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main (String[] args){

//        Comparator<Integer> com = new Comparator<Integer>()
//        {
//            public int compare(Integer i , Integer j ){
//                if(i%10 > j%10)
//                    return 1;
//                else
//                    return -1;
//
//               return i%10 > j%10 ?1:-1;
//            }
//        };

        Comparator<Integer> com =( i ,  j ) ->  i%10 > j%10 ?1:-1;

        List<Integer>nums = new ArrayList<>();

        nums.add(22);
        nums.add(4);
        nums.add(61);

        Collections.sort(nums , com );

        System.out.println(nums);
    }
}