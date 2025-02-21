

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




// class Human{
//    private int age;
//    private String name;
 ////Constructor///////
//    public Human(){
//     int a = 10;
//     String n = "Ayush";
//    }

//    public Human (int a , String n){ /////// PARAMETRIZED CONSTRUCTOR ////
//     age = a;
//     name = n;
//    }


// public int getAge() {
//     return age;
// }
// public void setAge(int age) {
//     this.age = 10;
// }
// public String getName() {
//     return name;
// }
// public void setName(String name) {
//     this.name = "Ayush" ;
// }

   

//    public int getAge(){
//      return age ;
//    }

//    public void setAge(int a){
//     age =a;
//    }

//    public void setName(String n){
//     name = n;
//    }
//    public String getName(){
//     return name;
//    }
// }
// public class JavaBasics {

// public static void main(String[] args) {

    //////////// Encapsulation Concept /////////////////////////
    // Human obj = new Human();
    // Human obj1 = new Human(23 , "Ayush");
    // obj.age = 20;
    // obj.name = "Ayush";

    // obj.setAge(12);
    // obj.setName("Ayush");

    // System.out.println(obj.getAge());
    // System.out.println(obj.getName());
// System.out.println(obj.getAge()+ ":" + obj.getName());

    // System.out.println(obj.name);




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



// }
// }





/////////////  INHERITANCE CONCEPT //////////////


// class Calc extends JavaBasics{
//     public int add(int n1 , int n2){
//     return n1 + n2;
//     }

//     public int sub(int n1 , int n2){
//         return n1 - n2;
//         }

//         public int multi(int n1 , int n2){
//             return n1 * n2;
//             }

//          public int div(int n1 , int n2){
//                 return n1 / n2;
//                 }
            
        
// }
// public class JavaBasics {

    // public static void main(String[] args) {

//         Calc obj = new Calc();
//         int r1 = obj.add(10 , 2);
//         int r2 = obj.sub(10,2);
//         int r3 = obj.multi(10 , 2);
//         int r4 = obj.div(10 , 2);
//         System.out.println(r4);
//     }
// }
    


// interface A{
//     void show();
//     void config();
//     int age = 22;
//     String area = "Mumbai";
// }

// class B implements A
// {
    
    
//     public void show(){
//         System.out.println("in B");
//     }
//     public void config(){
//         System.out.println("in config");
//     }
// }
// class B extends A
// {
//   public B(){
//     System.out.println("in B");
//   }
// }



// enum Status{
//     Running , Failed , Pending , Success;
// }

// class A{
//     public void show()
//     {
//         System.out.println("in A show");
//     }
// }
// class B extends A{
//     public void show()
//     {
//         System.out.println("in B show");
//     }
// }



@FunctionalInterface
interface A
 {
    void show();
 }

public class JavaBasics{
    public static void main(String[] args) {
    //    A obj;
    //    obj = new B();
    //    obj.show();
    //    obj.config();

    // //    System.out.println(obj.age);
    // //    System.out.println(obj.area);   ///// Should be accesed in Static way (A.area , A.age ) ////

    // System.out.println(A.age);
    // System.out.println(A.area);

        // int i = 5;

        // Status s = Status.Running;
        // System.out.println(s);
        
        // B obj = new B();
        // obj.show();
    
        A obj = () -> System.out.println("in show");

        obj.show();
            
        }

    }




