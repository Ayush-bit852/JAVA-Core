public class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException {
        //////////////////////////////////////////////////----------------------------//////////////////
        
        // try {
        //     int a = 10;
        //     int b = 0; // Arre bhai, 0 se divide nahi hota, exception ayegi
        //     int result = a / b;
        //     System.out.println("Result: " + result); // Ye line execute nahi hogi
        // } catch (ArithmeticException e) {
        //     System.out.println("Arre bhai, galti kardi... Divide by zero nhi kar sakte!");
        // } finally {
        //     System.out.println("Program ka kaam khatam, chaho to safe exit le lo.");
        // }
       
        /////////////////////////////////////////////////----------------------------//////////////////
        

        int i = 0;
        int j = 0;
        j = 18/i;
        //  System.out.println(j);

         System.out.println("Byee");


    }
}


//class DivideByZeroException extends RuntimeException {
//    public DivideByZeroException(String m) {
//        super(m);
//    }
//}
//public class Geeks {
//    public static void divide(int a, int b) {
//        if (b == 0) {
//            throw new DivideByZeroException("Division by zero is not allowed.");
//        }
//        System.out.println("Result: " + (a / b));
//    }
//
//    public static void main(String[] args) {
//        try {
//            divide(10, 0);
//        } catch (DivideByZeroException e) {
//            System.out.println("Caught Exception: " + e.getMessage());
//        }
//    }
//}