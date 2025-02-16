import java.util.Arrays;
import java.util.List;

public class StreamAPIIntro {
    public static  void main (String[] args){
//        List<Integer>nums = new ArrayList<>();
//        nums.add(3);
//        nums.add(5);
//        nums.add(9);

        List<Integer>nums = Arrays.asList(2,4,6,8);  // aslist is a method that gives you a list

//        for (int n:nums){
//            System.out.println(n);
//        }

        nums.forEach(n -> System.out.println(n));

//        int sum = 0;
//        for(int n : nums)
//        {
//            if(n%2==0)
//            {
//                n = n*2;
//                 sum = sum + n;
//            }
//        }
//        System.out.println(nums);
    }
}
