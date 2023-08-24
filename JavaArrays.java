// public class JavaArrays {
//     public static void PairNum(int num[]){
//         for(int i=0;i<num.length;i++){
//             int curr=num[i];
//         for(int j=i+1;j<num.length;j++){
//             System.out.print("("+curr+","+num[j]+")");
//         }
//         System.out.println();
//         }
//     }

//     public static void main (String args[]){
//         int nums[]={2,4,6,8,10};
//         PairNum(nums);
        

//     }
// }


// -------------------Subarray-----------------------
// public class JavaArrays {
//     public static void PairNum(int num[]){
//         for(int i=0;i<num.length;i++){
//             int curr=i;
//         for(int j=i+1;j<num.length;j++){
//            int end=j;
//            for(int k=curr;k<=end;k++){
//             System.out.print(num[k]);
//            }
//            System.out.println();
//         }
//         System.out.println();
//         }
//     }
//     public static void main (String args[]){
//         int nums[]={2,4,6,8,10};
//         PairNum(nums);
//     }
// }

// -----------Max subarray sum-----------------
// public class JavaArrays {
//     public static void MaxSubarraySum(int num[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int[num.length];
//         prefix[0]=num[0];
//         for(int i=1;i<num.length;i++){
//             prefix[i]=prefix[i-1]+num[i];
//         }


//         for(int i=0;i<num.length;i++){
//             int start=i;
//             for(int j=i+1;j<num.length;j++){
//                 int end=j;
//                 currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
//                 System.out.println(currSum);
//             if(maxSum<currSum)
//             {
//                 maxSum=currSum;
//             }
//         }
//         }
//         System.out.println("Max of SubArray is : "+maxSum);
//     }
//     public static void main (String args[]){
//         int nums[]={2,4,6,8,10};
//         MaxSubarraySum(nums);
//     }
// }

// public class JavaArrays {
//     public static void trappingRainWater(int height[]){
//         int n=height.length;

//         //  cal left max boundary
//         int leftMax[]=new int[n];
//         leftMax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i]=Math.max(height[i],leftMax[i-1]);
//         }

//         //  cal right max boundary
//         int rightMax[]=new int[n];
//         rightMax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(height[i],rightMax[i+1]);
//         }

//         // cal waterlvl
//         int trappedWater=0;
//         int width=1;
//         for(int i=0;i<n;i++){
//              int waterLevel=Math.min(leftMax[i],rightMax[i]);
//              trappedWater+=waterLevel-height[i] * width;

//         }
//         System.out.println(trappedWater);
//     }
//      public static void main (String args[]){
//         int height[]={4,2,0,6,3,2,5};
//         trappingRainWater(height);
//     }
// }


// ---------------------Array input Operations----------------
// import java.util.Scanner;

// public class JavaArrays {
//      public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size of the array : ");
//         int n=sc.nextInt();
//         int marks[]=new int[n];
//         System.out.println("enter marks of students : ");

//         for (int i=0;i<n;i++){
//             marks[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){

//             System.out.println( "marks of Student "+(i+1)+": "+marks[i]);
//         }

//     }
// }


// ---------------Linear Search-----------------

// import java.util.Scanner;

// public class JavaArrays {

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

// public class JavaArrays {

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
// public class JavaArrays {

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