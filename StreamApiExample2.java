import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample2 {
    public static void main (String [] args){

        List<Integer>num = Arrays.asList(2,4,6);
        Stream<Integer> S2 = num.stream();
        S2.filter(S3 -> S3%2==0);
        S2.map(S3-> S3*S3);
        S2.forEach(System.out::println);

    }
}
