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
public class JavaArrays {
    public static void PairNum(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=i;
        for(int j=i+1;j<num.length;j++){
           int end=j;
           for(int k=curr;k<=end;k++){
            System.out.print(num[k]);
           }
           System.out.println();
        }
        System.out.println();

        }
    }
    public static void main (String args[]){
        int nums[]={2,4,6,8,10};
        PairNum(nums);
    }
}
