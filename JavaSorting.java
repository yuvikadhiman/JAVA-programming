// // --------bubble sort--------------------
// public class JavaSorting {

//     public static void bubbleSort(int array[]){
//         int n=array.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1;j++){
//                 if(array[j]>array[j+1]){
//                     int temp=array[j];
//                     array[j]=array[j+1];
//                     array[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int array[]={7,5,4,1,2,3,9};
//         bubbleSort(array);

//     }
// }
  

// --------selection sort--------------------
// public class JavaSorting {

//     public static void selectSort(int array[]){
//         int n=array.length;
//         for(int i=0;i<n-1;i++){
//             int min=i;
//             for(int j=i+1;j<n;j++){
//                 if(array[min]>array[j]){
//                     min=j;
//                 }
//             }
//             int temp=array[min];
//             array[min]=array[i];
//             array[i]=temp;    
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(array[i]+" ");
//          }
//         }
//     public static void main(String args[]){
//         int array[]={5,4,1,3,2,6,8};
//         selectSort(array);
//     }
// }
  
// --------------Insertion Sort--------------------

// public class JavaSorting {
//     public static void insertionSort(int array[]){
//         for(int i=1;i<array.length;i++){
//             int curr=array[i];
//             int prev=i-1;
//             while(prev>=0 && array[prev]>curr){
//                array[prev+1]=array[prev];
//                prev--;
               
//             }
//             array[prev+1]=curr;
//         }
//          for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//          }
//         }
        
//     public static void main(String args[]){
//         int array[]={5,4,1,3,2};
//         insertionSort(array);
//     }
// }