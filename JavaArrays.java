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

public class JavaArrays {
    public static void trappingRainWater(int height[]){
        int n=height.length;

        //  cal left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //  cal right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        // cal waterlvl
        int trappedWater=0;
        int width=1;
        for(int i=0;i<n;i++){
             int waterLevel=Math.min(leftMax[i],rightMax[i]);
             trappedWater+=waterLevel-height[i] * width;

        }
        System.out.println(trappedWater);
    }
     public static void main (String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappingRainWater(height);
    }
}