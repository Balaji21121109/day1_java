// public class variables{

//     static int b= 20;
//     int c = 30;

//     public static void main (String[] args){
         

//         int a = 10; ///local variables
//         variables ref=new variables();
//         System.out.println(a);
//         System.out.println(variables.b+a);
//         System.out.println(ref.c+b);
//     }
// }




public class variables {

    static int c = 300;// static variable (class varible)
        int b = 200;//instance variable
    public static void main (String[] args){
        System.out.println("hello world");
        int a =100;/// local variables

         variables ref = new variables();
        System.out.println(a);
        System.out.println(ref.b);
        System.out.println(variables.c);
    }
}

