import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample2 {
    public static void main (String [] args){

        List<Integer>num = Arrays.asList(2,4,6);
        Stream<Integer> S1 = num.stream();
        Stream<Integer> S2 = S1.filter(n -> n%2==0);
        Stream<Integer> S3 = S2.map(n-> n*n);
        S3.forEach(System.out::println);

    }
}
