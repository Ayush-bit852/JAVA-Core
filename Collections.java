import java.util.*;
import java.util.Set;

public class Collections {
    public static void main (String[] args){
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(3);
//
//        System.out.println(list.size());
//
//        list.add(9);
//        System.out.println(list.get(3));
//        list.addFirst(87);
//        System.out.println(list.indexOf(87));
//        System.out.println(list.indexOf(1));
//        System.out.println(list.indexOf(4));
//        System.out.println(list.indexOf(3));
////        System.out.println(list.indexOf(9));

//        System.out.println(Arrays.toString(list.toArray()));


//        Collection<Integer>nums = new ArrayList<Integer>();
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//        nums.add(9);
//
//        for (Object n : nums){
//            int num = (Integer)n;
//            System.out.println(num*2);
//        }


//        System.out.println(nums);


        Set<Integer>nums = new HashSet<>();
        nums.add(68);
        nums.add(72);
        nums.add(81);
        nums.add(99);

       Iterator<Integer>value = nums.iterator();

       while(value.hasNext())
        System.out.println(value.next());

        value.remove();
        System.out.println(nums);

//        System.out.println(nums);
//        for (int n : nums){
//          System.out.println(n);
//        }


        Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("a");
//


//        System.out.println("set:" +set);


    ///////////////////////////---------------------- Maps-----------------------------////////////////////////////////////////////////////////////////////////////////////////////////


    }

}
