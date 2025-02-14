import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String [] args){
        LinkedHashMap<String , Integer> demo = new LinkedHashMap<>();

        demo.put("apple" ,2134);
        demo.put("Mango" , 45);
        demo.put("Banana" , 1234);
        demo.put("Cherry" , 2002);
        System.out.println(demo);


        demo.putLast("Ayush",21);
        System.out.println(demo);

        demo.putFirst("Sharma" , 2002);
        System.out.println(demo);
    }
}
