// class Calculator{
//     int a ;
//     public int add(int n1, int n2){
//        int r = n1 + n2;
//         return r;
//     }
// }

// import java.util.Arrays;

// import java.util.Arrays;

// class Hello{
// public static void main (String args []){
//   int num1=3;
//   int num2=4;
// int result= (num1+num2);

//    byte b = 127;
//    int a = b;

//     float f = 5.9f;
//    int x = (int)f;

//     int x = 1;
//     int y = 2;
//     int a = 9;
//     int b = 7;

//     boolean result = x<y || a>b;
//     System.out.println(result);

//     int a = 4;
//     int b = 7;
//     int c = 10;

//   if(a>b && a>c )
//         System.out.println(a);

//    else if (b>c)
//         System.out.println(b);

//     else
//         System.out.println(c);


//     int n = 2;
      
//     switch(n){
//             case 1:
//             System.out.println("Monday Hai aaj bro");
//             break;
//             case 2:
//             System.out.println("Tuesday Hai aaj bro");
//             break;
//             case 3:
//             System.out.println("Wednsday Hai aaj bro");
//             break;
//             case 4:
//             System.out.println("Thursday Hai aaj bro");    
//             break;
//             case 5:
//             System.out.println("Friday Hai aaj bro");
//             break;
//             case 6:
//             System.out.println("Saturday Hai aaj bro");
//             break;
//             case 7:
//             System.out.println("Sunday Hai aaj bro");
//             break;
            
//     }
    
//     String n = "mon";
//     String result  = " ";
      
//     result =switch(n){
//             case "Saturday","Sunday" ->  "6 am" ;
//             case "Monday" -> "8 am";
//             default ->  "7 am";
//     };
//         System.out.println(result);



//     String n = "Saturday";
//     String result  = " ";
      
//     result =switch(n){
//             case "Saturday","Sunday" : yield "6 am" ;
//             case "Monday" : yield "8 am";
//             default :yield  "7 am";
//     };
//         System.out.println(result);

//     int i = 1;
//     while (i<=5) {
//         System.out.println("hello");
//         int j = 1;
//         while(j<4){
//             System.out.println("Hi");
//             j++;
//         }
//         i++;
//     }

//     int i = 6;
//     do{
//         System.out.println("hi  " + i);
//         i++;
//     }
//     while (i<=5); {
    

//     }

//     for(int i=1;i<6;i++){
//         System.out.println("hello " +i);
//     }



//     int num1 = 4;
//      int num2 = 6; 
     
//      Calculator calc = new Calculator();
//    int result = calc.add(num1,num2);
//    System.out.println(result);


        
//         int num1 = 5;
//         int num2 = 6;
//         Calculator calc = new Calculator();
//         int result = calc.add(num1,num2);
//         // int result=(num1+num2);
//          System.out.println(result);



//   Computer obj = new Computer();
//   String str = obj.getMeAPen(3);
//   System.out.println(str);
//   obj.playMusic();

//  int i = 2;
//  int j = 4;
//  int k = 6;

// int num[] = {1,2,3,4,5,6,7};
// num[0]=3;
// // System.out.println(num[0]);
// // System.out.println(Arrays.toString(num));
// System.out.println(num[1]);
// System.out.println(Arrays.toString(num));


// int num[] = new int[4];
// num[0] = 1;
// num[1] = 2;
// num[2] = 3;
// num[3] = 4;

// System.out.println(Arrays.toString(num));

// // OR (Ye bhi kar sakte ho )

// for(int i=0;i<4 ;i++){
//     System.out.println(num[i]);
// }

// int num[] = {1,2,3,4,5,6,7};
// System.out.println(num[1]);
// System.out.println(Arrays.toString(num));

// for(int i = 0 ; i <=6;i++){
//     System.out.println(num[i]);
// }

//     int num[][] = new int[3][];   //Jagged Array

//     num[0] = new int[3];
//     num[1] = new int[4];
//     num[2] = new int[2];

//     for(int i = 0 ; i<num.length ; i++){

//         for(int j = 0 ; j<num[i].length ; j++){

//             num[i][j] =(int)(Math.random()*100);
            
           
//         }
        
//     }

    
//     for(int i = 0 ; i<3 ; i++){

//         for(int j = 0 ; j<4 ; j++){

//             System.out.print(num[i][j] + " ");
            
//         }
//         System.out.println();
//     }

//     for(int n[]:num){
//         for(int m :n){
//             System.out.print(m + " ");
//         }
//         System.out.println();
//     }




// }

//     }




//   class Computer {
//         public void playMusic(){
//             System.out.println("Playing Music....");
//         }
//         public String getMeAPen(int cost){
//             if(cost >10)
//                  return "Pen";
//             else
//                  return "Gareeb AAdmi";
//         }
//  }


//  class Calculator{
//     public int add(int n1 , int n2)
//     {
//         int r = (n1 + n2);
//         return r;
//     }
// }


// class Hello{
//     public static void main (String args []){
//         int num1 = 4;
//         int num2 = 6;
//         Calculator calc = new Calculator();
//         int result = calc.add(num1,num2);
//         System.out.println(result);
//     }
// }



// public class JavaBasics {
//     public static String main(String[] args) {
//         // 1. Stack me variable "a" create ho raha hai
//         int a = 10; 

//         // 2. Stack me "b" ka reference banta hai, aur Heap me object create hota hai
//         String b = new String("Hello");
        
//         System.out.println(a);
//         return b;

//         3. Ek Object Heap me create hota hai, lekin uska koi reference nahi bacha
//         new String("Garbage Data");

//         // Garbage Collector "Garbage Data" ko free kar dega kyunki uska koi kaam nahi.
//     }
// }




class Human{
   private int age;
    String name;
}
public class JavaBasics {

public static void main(String[] args) {

    //////////// Encapsulation Concept /////////////////////////
    Human obj = new Human();
    obj.age = 20;
    obj.name = "Ayush";

    System.out.println(obj.name);




    // StringBuffer sb = new StringBuffer("Ayush");
    // // System.out.println(sb.capacity());
    // sb.append(" sharma");

    // System.out.println( "Pagal hai "   + sb);

    // String str = sb.toString();


    // StringBuilder sb = new StringBuilder("GeeksforGeeks");
    // System.out.println("Initial StringBuilder: " + sb);

    // sb.append(" is awesome!");
    // System.out.println("After append: " + sb);
     
    // sb.insert(2, 9);
    // System.out.println(sb);

    // 3. Replace a substring with another string
    // sb.replace(0, 5, "Welcome to");
    // System.out.println("After replace: " + sb);



}
}
