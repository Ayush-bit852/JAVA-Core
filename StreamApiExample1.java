import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample1 {
    public static void main(String [] args){

        List<Integer>nums = Arrays.asList(2,3,4,5);
        nums.stream()
                .filter(num -> num % 2 == 0)  // Filters even NUmbers
                .map(num -> num * num)
                .forEach(System.out::println);





    }

}
