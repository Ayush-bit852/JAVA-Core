//class B extends Thread
//{
//     public void show (){
//         for (int i = 1 ; i<=100 ; i++)
//         {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//
//     }
//}
//
//class  C extends Thread
//{
//    public void show (){
//        for (int i = 1 ; i<=100 ; i++)
//        {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
//
//
//public class MultiThreading    {
//    public static void main (String [] args){
//     B obj1 = new B();
//     C obj2 = new C();
//
////     obj2.setPriority(Thread.MAX_PRIORITY);
//     obj1.show();
//     obj2.show();
//
//    }
//}

class Counter{
    int count;
    public void increment(){
        count++;
    }
}



class B extends Thread {
    public void run() { // Override the run() method for the thread
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Hi");
//            try {
//                Thread.sleep(10); // Pause the thread for 10 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class C extends Thread {
    public void run() { // Override the run() method for the thread
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Hello");
//            try {
//                Thread.sleep(10); // Pause the thread for 10 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();

        obj1.start(); // Start thread B
        try{
            Thread.sleep(3);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        obj2.start(); // Start thread C
    }
}
