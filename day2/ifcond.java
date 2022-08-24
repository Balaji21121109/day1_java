
import java.util.Scanner;
public class ifcond {
    public static void main(String[] args){
        System.out.println("enter any number here");
int num1;
int num2;
        Scanner a = new Scanner(System.in);
        System.out.println("enetr num1");
num1 = a.nextInt();
System.out.println("enter num2");
num2 = a.nextInt();



System.out.println("you enter the num1 " + num1);
System.out.println("you enter the num2 " + num2);


    if(num1>num2){
        System.out.println("num1 is greater then num2");
    } else if(num1<num2){
        System.out.println("num2 is greather then num1");

    } else if(num1==num2){
        System.out.println("num1 and num2 both are equal");

    } else {
        System.out.println("i don't know the value");
    }

    }
    
}
