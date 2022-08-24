
//interger type of the format int this case

// import java.util.Scanner;

// public class Input{
//     public static void main(String[] args){
    
//     System.out.println("Enetr any number your wish");
//     Scanner some = new Scanner(System.in);
//     int name = some.nextInt();
//     System.out.println("the value is " + name);

// }
// }


/// string format in the se case we will see


import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        System.out.println("Enter your name");

        Scanner obj = new Scanner(System.in);

        String name =obj.nextLine();
        System.out.println("you enter your name as " + name);
        System.out.println("if it's correct then press yes");
        String yes=obj.nextLine();
    
        System.out.println("Thanks for your response");

    }
}