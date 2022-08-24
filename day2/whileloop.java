// public class whileloop {
//     public static void main (String[] args){
//         int i = 1;
//         int n= 10;
//         while (i<=n){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

import java.util.Scanner;
public class whileloop{
    public static void main( String[] args){
        System.out.println("enter number");
        int num ;
        int sum = 0;
        Scanner a = new Scanner(System.in);
        num = a.nextInt();

       sum += num;
     int i =1;
        while (i<=5){
            sum+=i;
            System.out.println(i);
            i++;
        }




    }
}