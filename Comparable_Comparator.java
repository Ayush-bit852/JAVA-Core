import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Comparator {
    public static void main (String [] args){

//        List<Integer>nums = new ArrayList<>();
//
//        Comparator<Integer>com = new Comparator<Integer>()
//        {
//            public int compare(Integer i , Integer j )
//            {
//                if(i%10 > j%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//
//        nums.add(1271);
//        nums.add(102);
//        nums.add(73);
//        nums.add(9);
//        nums.add(8111114);
//
//            Collections.sort(nums , com);
//
//        System.out.println(nums);
//


//         ArrayList<Integer> marks = new ArrayList<>();
//         marks.add(12);
//        marks.add(34);
//        marks.add(6);
//       Collections.sort(marks);
//        System.out.println(marks);

       ArrayList<SortingObjects>emps = new ArrayList<>();
       emps.add(new SortingObjects("Ayush" , "9999988888", 12));
       emps.add(new SortingObjects("Yash" , "8888899999" , 34));
       emps.add(new SortingObjects("Pranay" , "0000011111" , 6));

        System.out.println(emps);



    }
}
