class ArithmeticException extends Exception {
    public ArithmeticException(String m) {
        super(m);   //message
    }
}

public class ExceptionHHandling {
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

        int i = 20;
        int j = 12;

        try {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want to print zeroo..");
        }
        catch (ArithmeticException e) {
            //    j= 18/1;
            //
            System.out.println("This is the default value ..." + e);
        }

        catch (Exception e) {
            System.out.println("Something went wrong...." + e);
        }
        System.out.println(j);
        System.out.println("Byee");
    }
}



// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String m) {
//         super(m);   //message
//     }
// }

// // Using the Custom Exception
// public class ExceptionHHandling {
//     public static void validate(int age)
//       throws InvalidAgeException {
//         if (age < 18) {
//             throw new InvalidAgeException("Age must be 18 or above.");
//         }
//         System.out.println("Valid age: " + age);
//     }

//     public static void main(String[] args) {
//         try {
//             validate(12);
//         } catch (InvalidAgeException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }