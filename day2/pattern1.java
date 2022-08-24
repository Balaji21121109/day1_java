public class pattern1 {
    public static void main(String[] args){
        System.out.println("below your pattern is printed");

        for(var i=0;i<=5;i++){
            for(var j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}
