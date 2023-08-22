// import java.util.*;
// class JavaBasic{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// class JavaBasic{
//     public static void main(String arg[]){
//         try (Scanner Sc = new Scanner(System.in)) {
//             float radius=Sc.nextFloat();
//             float areaCircle=3.14f*radius*radius;
//             System.out.println(areaCircle);
//         }
//     }
// }

// import java.util.*;
// public class JavaBasic {
//     public static void main (String arg[]){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         char operator =sc.next().charAt(0);
//         switch(operator){
//             case '+':System.out.println(a+b);
//                 break;
//             case '-':System.out.println(a-b);
//                 break;
//             case '*':System.out.println(a*b);
//                 break;
//             case '/':System.out.println(a/b);
//                 break;
//         }


        

//     }
// }
    
import java.util.*;
// public class JavaBasic {
//     public static void main (String arg[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter value of a :");
//         int a=sc.nextInt();
//         System.out.println("Enter value of b :");
//         int b=sc.nextInt();
//         if(a>b){
//             System.out.println("a is larger than b :");
//         }
//         else
//         System.out.println("b is greater a");
//     }
// }

// public class JavaBasic {
//     public static void main (String arg[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter value of a :");
//         int a=sc.nextInt();
//         if(a%2==0){
//             System.out.println("Even number");
//         }
//         else{
//             System.out.println("Odd number");
//         }
       
//     }
// }

public class JavaBasic {
    public static void main (String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of Income :");
            int a=sc.nextInt();
            int tax;
            if(a<50000){
                tax=0;           
            }
            else if(a>=50000 && a<100000){
               tax=(int)(a*0.2);
            }
            else {
               tax=(int)(a*0.3);
            }
            System.out.println("YOur tax : "+tax);
        }
    }
}

