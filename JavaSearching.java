
// ---------------Linear Search-----------------

// import java.util.Scanner;

// public class JavaSearching {

//     public static int linearSearch(int marks[],int key,int n){
//         for (int i=0;i<n;i++){
//             if(key==marks[i]){
//                 return i;
//             } 
//         }
//         return -1;
//     }
//      public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size of the array : ");
//         int n=sc.nextInt();
//         int marks[]=new int[n];
//         System.out.println("enter marks of students : ");
        
//         for (int i=0;i<n;i++){
//             marks[i]=sc.nextInt();
//         }
//         System.out.println("enter the key to search : ");
//         int key=sc.nextInt();
//         int index=linearSearch(marks,key,n);
//         if(index==-1){
//             System.out.println("Not found");
//         }
//         else{
//             System.out.println("key is at index :"+index);
//         }
//     }
// }

// -------------------Largest number in array------------------
// import java.util.Scanner;
// public class JavaSearching {
//     public static int largestNum(int array[]){
//         int n=array.length;
//         int maxNum=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(maxNum<array[i]){
//                 maxNum=array[i];
//             }
//         }
//         return maxNum;
//     }
//      public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size of the array : ");
//         int n=sc.nextInt();
//         int array[]=new int[n];
//         System.out.println("enter elemets of array : ");
        
//         for (int i=0;i<n;i++){
//             array[i]=sc.nextInt();
//         }
//         int max=largestNum(array);
//         System.out.println("Maximun number is : "+max);
//     }
// }

// -----------------Binary search-------------------

// import java.util.Scanner;
// public class JavaSearching {
//     public static int binarySearch(int array[],int key){
//         int n=array.length;
//         int start=0;
//         int end=n-1;
//         while(start<=end){
//              int mid=(start+end)/2;

//              if(array[mid]==key){
//                 return mid;
//              }
//              if(key>array[mid]){
//                 start=mid+1;
//              }
//              else{
//                 end=mid-1;
//              }
//          }
//         return -1;
//     }
//      public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size of the array : ");
//         int n=sc.nextInt();
//         int array[]=new int[n];
//         System.out.println("enter elemets of array : ");
        
//         for (int i=0;i<n;i++){
//             array[i]=sc.nextInt();
//         }
//         System.out.println("enter the key to search : ");
//         int key=sc.nextInt();
//         int index=binarySearch(array,key);
//         if(index==-1){
//             System.out.println("Not found");
//         }
//         else{
//             System.out.println("Key at in :"+index);
//         }
//     }
// }

// --------------Reverse array-------------------

// import java.util.Scanner;
// public class JavaSearching {
//     public static void reverseArr(int array[]){
//         int n=array.length;

//         int start=0; //start index
//         int end=n-1; //end index
//         while(start<end){
//             int temp=array[start];
//             array[start]=array[end];  //swap values of index in array
//             array[end]=temp;
//             start++;
//             end--;
//         }
//         System.out.println();
//         System.out.println("reversed array :");
//        for (int i=0;i<n;i++){
//         System.out.print(array[i]+" ");
//        }
//     }
//      public static void main (String args[]){
//         int array[]={2,4,6,8,10};
//         System.out.println("original array :");
//         for (int i=0;i<array.length;i++){
//           System.out.print(array[i]+" ");
//        }
//        System.out.println();
//         reverseArr(array);
//     }
// }