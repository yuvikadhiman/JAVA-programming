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

// import java.util.Scanner;
// public class JavaFunctions {
//     public static  void binToDec(int decNum){
//         int myNum=decNum;
//         int pow=0;
//         int binNum=0; 
//         while(decNum>0){
//             int rem= decNum%2;
//             binNum=binNum+(rem*(int)Math.pow(10,pow));
//             pow++;
//             decNum=decNum/2;
//         }
//         System.out.println("Binary of "+ myNum +" : " +binNum);
//     }
//     public static void main(String args[]){
//         int num=7;
//         binToDec(num);
        
//     } 
    
// }

// -----------SWAP NUMBERS ------------

// import java.util.Scanner;
// public class JavaFunctions {
//     public static  void Swap(int n1,int n2){
//         int temp=n1;
//         n1=n2;
//         n2=temp;
//         System.out.println("num1: "+n1+" num2 :"+n2);     
//     }
//     public static void main(String args[]){
//         int num1=3;
//         int num2=6;
//         System.out.println("num1: "+num1+" num2 :"+num2);
//         Swap(num1,num2);
//         //call by value ->changes are made on the copy of the actual parameters
//         System.out.println("num1: "+num1+" num2 :"+num2); 
           

//     } 
    
// }

// ------------------------------------------------------------------
// import java.util.Scanner;
// public class JavaFunctions {
//     public static  int Factorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static void main(String args[]){
//         System.out.println("Enter n value  :");
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Enter r value  :");
//         int r=sc.nextInt();
//         int nfact=Factorial(n);
//         int rfact=Factorial(r);
//         int numfact=Factorial(n-r);
//         int binCoeff=(nfact)/(rfact*numfact);
//         System.out.println("Binomial Coefficient is :"+binCoeff);

//     } 
// }


// -------------hollow rectangle--------------------- 
// import java.util.Scanner;
// public class JavaFunctions {
    
//     public static void main(String args[]){
//         for(int row =1;row<=4;row++){
//             for(int col=1;col<=5;col++){

//                 if(row==1||row==4||col==1||col==5){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                  }
//             }
//             System.out.println();
//         }
//     } 
// }


