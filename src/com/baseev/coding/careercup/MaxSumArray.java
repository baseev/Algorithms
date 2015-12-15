package com.baseev.coding.careercup;

public class MaxSumArray
{

    public static int maxSum(int[] arr) {
        int ret = -1;
        if(arr.length == 1 ){ 
            ret = arr[0];
        } else {
            int maxSum = arr[0];
            int current_max = arr[0];
            for(int i=1; i<arr.length; i++) {
                current_max = Math.max(arr[i], current_max+arr[i]);
                maxSum = Math.max(maxSum, current_max);
            }
            ret = maxSum;
        }
        return ret;
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int arr[] = {3, 5, 3, 4};
        System.out.println(MaxSumArray.maxSum(arr));
    }

}
