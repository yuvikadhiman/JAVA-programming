// ------------PRIME IN RANGE-------------

// import java.util.Scanner;

// public class JavaFunctions {
//     public static boolean isPrime(int n){
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                return false;
//             }
//         }
//         return true;
//     }
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your number");
//         int num=sc.nextInt();

//         for(int i=2;i<=num;i++){
//             if(isPrime(i)){
//                 System.out.print(i);
//             }
//         }

//     } 
    
// }
// X-------------------------X-------------------------X

// -----------CONVERT BINARY TO DECIMAL------------

// import java.util.Scanner;
// public class JavaFunctions {
//     public static  void binToDec(int binNum){
//         int myNum=binNum;
//         int pow=0;
//         int decNum=0; 
//         while(binNum>0){
//             int lastDigit=binNum%10;
//             decNum= decNum+(lastDigit* (int)Math.pow(2,pow));
//             pow++;
//             binNum=binNum/10;
//         }
//         System.out.println("decimal of "+ myNum +" : " +decNum);
//     }
//     public static void main(String args[]){
//         int num=11001;
//         binToDec(num);
        
//     } 
    
// }

// -----------CONVERT DECIMAL TO BINARY ------------

import java.util.Scanner;
public class JavaFunctions {
    public static  void binToDec(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0; 
        while(decNum>0){
            int rem= decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("Binary of "+ myNum +" : " +binNum);
    }
    public static void main(String args[]){
        int num=7;
        binToDec(num);
        
    } 
    
}
