// public class nested {
//     public static void main(String[] args){
//         int i,j;

//         for(i=1;i<=5;i++){
//             for(j=1;j<=5;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


public class nested{
    public static void main(String[] args){

        for(var i=0;i<=5;i++){
            for(var j=0;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}