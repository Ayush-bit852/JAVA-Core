import java.util.*;

public class  HashMapDemo {
    public static  void main (String [] args){

//        HashMap<Integer , String> map = new HashMap<>(14 ,0.5f);
//        map.put(12 , "Ayush");
//        map.put(24 , "Monu");
//        map.put(33 , "Chandra Bhai");
//
////        System.out.println(map.get(3));
//        map.put(122 , "NeoSoft");
//
//        System.out.println(map);
//
//        String student = map.get(1);
//        System.out.println(student);
//
//        System.out.println(map.hashCode());
//        System.out.println(map.containsKey(12));

//        System.out.println(map.containsValue("Ayush"));


//
//        Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("a");
//


//        System.out.println("set:" +set);


//        Map<String, String> hm = new LinkedHashMap<>();
//        hm.put("7","M");
//        hm.put("1","M");
//        hm.put("3","M");
//
//        System.out.println("hm: " +hm);
//
//        Set<Integer> keys = map.keySet();
//        for (int i : map.keySet()){
//            System.out.println(map.get(i));
//        }
//
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//

    HashMap<String , Integer> fruitmap = new HashMap<>() ;
    fruitmap.put("Mango" , 50);
    fruitmap.put("banana" , 60);
    fruitmap.put("Apple" , 80);
    fruitmap.put("Grape" , 20);



        System.out.println(fruitmap);

    }
}
