/*public class Forloop {
    public static void main(String[] args){

        int a = 10;

        for( var i= 1;i<=a;i++){
            System.out.println(i);
        }

    }
}
*/


//sum of the numbes loop

/*public class Forloop{
    public static void main(String[] args){
       int sum= 2;
       int a = 100;

       for(var i=a;i>=10;--i){
        sum +=i;
       }
        System.out.println("Sum of the Numbers" + sum);
       
    }
}*/

// for each loop

public class Forloop{
    public static void main(String[] args){
     int a[] = {10,20,30, 49,345,123};

     for(int b : a){
        System.out.println(b);
     }
     for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
        
     }

    }
}