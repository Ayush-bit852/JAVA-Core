public class ExceptionHandling {
    public static void main(String[] args) {
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
        try {      
             j = 18/i;
        }
        catch (ArithmeticException e) {
            System.out.println(e);

        }
        //  System.out.println(j);

         System.out.println("Byee");
    }
}