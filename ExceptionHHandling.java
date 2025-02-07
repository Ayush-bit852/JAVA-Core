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
//class TooYoungException extends Exception {
//    public TooYoungException(String m){
//        super(m);  // Message will be deployed
//    }
//}

//public class ExceptionHHandling{
//    public static void validate (int age )
//        throws TooYoungException{
//        if (age <18){
//            throw new TooYoungException("You are too young for Marriage ");
//        }
//        System.out.println("Valid: " + age );
//    }
//}


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



////////------------///////////------------///////////////-----------////////-------///--------/-
                    //Threads//
//class MyThread extends Thread
//{
//    // initiated run method for Thread
//    public void run()
//    {
//        String str = "Thread Started Running...";
//        System.out.println(str);
//    }
//}

////////////////////////////////////////////////////////////////////////////////

// Running the Threads in Java
//
//import java.io.*;
//        import java.util.*;
//
//// Method 1 - Thread Class
//class ThreadImpl extends Thread
//{
//    // Method to start Thread
//    @Override
//    public void run()
//    {
//        String str = "Thread Class Implementation Thread"
//                + " is Running Successfully";
//        System.out.println(str);
//    }
//}
//
//// Method 2 - Runnable Interface
//class RunnableThread implements Runnable
//{
//    // Method to start Thread
//    @Override
//    public void run()
//    {
//        String str = "Runnable Interface Implementation Thread"
//                + " is Running Successfully";
//        System.out.println(str);
//    }
//
//}
//
//public class Geeks
//{
//    public static void main(String[] args)
//    {
//
//        // Method 1 - Thread Class
//        ThreadImpl t1 = new ThreadImpl();
//        t1.start();
//
//        // Method 2 - Runnable Interface
//        RunnableThread g2 = new RunnableThread();
//        Thread t2 = new Thread(g2);
//        t2.start();
//
//    }
//}