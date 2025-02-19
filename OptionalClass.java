public class OptionalClass {
    public static void main(String [] args){

        String name = getName(1);
        System.out.println(name.toUpperCase());
    }

    private static String getName(int id ){
        //get from DB
        return "Ram";

    }
}
