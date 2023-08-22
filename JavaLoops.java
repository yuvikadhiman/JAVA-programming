// -----------------------------DO WHILE---------------------------

// import java.util.Scanner;

// public class JavaLoops {
//     public static void main (String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int num;
//         do{System.out.println("enter your number");
//         num=sc.nextInt();
//         if(num%10==0)
//         System.out.println("your number is : "+num);
//     }while(true);

//     }
// }



// -----------------------------PRIME NUMBER---------------------------

// import java.util.Scanner;

// public class JavaLoops {
//     public static void main (String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int num;
//         System.out.println("Enter your number");
//         num=sc.nextInt();
//         boolean isPrime=true;
//         for (int i=2;i<=num-1;i++){
//             if(num%i==0){
//                 isPrime=false;
//             }
//         }
//         if(isPrime==true){
//             System.out.println("Prime number");
//         }
//         else{
//             System.out.println("Not prime number");
//         }
//     }
// }


// -----------------------------SUM OF N NUMBERS---------------------------

// import java.util.Scanner;

// public class JavaLoops {
//     public static void main (String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int num;
//         System.out.println("Enter your number");
//         num=sc.nextInt();
//         int sum=0;
//         int i=1;
//         while(i<=num){
//             sum=sum+i;
//             i++;
//         }
//         System.out.println(sum);
               
        
//     }
// }

// -----------------------------REVERSE NUMBERS---------------------------
// import java.util.Scanner;

// public class JavaLoops {
//     public static void main (String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int num;
//         System.out.println("Enter your number");
//         num=sc.nextInt();
//         while(num>0){
//             int lastdigit=num%10;
//             num=num/10;
//             System.out.println(lastdigit);
//         }
//     }
// }

// ----------------X-----------------------X------------------X

// -------------PATTERN---------------------

// import java.util.Scanner;
// public class JavaLoops {
//     public static void main (String arg[]){
//         for(int i=0;i<=5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }--  
// }


// import java.util.Scanner;
// public class JavaLoops {
//     public static void main (String arg[]){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char) j);
//             }
//             System.out.println();
//         }
//     }
// }