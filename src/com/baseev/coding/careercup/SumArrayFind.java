package com.baseev.coding.careercup;

import java.util.Arrays;

public class SumArrayFind
{

    public static int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low)
        {
            int mid = low + (high - low)/2;
            if (x == arr[mid])
                return mid;
            if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high, x);
            else
                return binarySearch(arr, low, (mid -1), x);
        }
        return -1;
    }
    
    public static int countPairsWithDiffK(int arr[], int n, int k)
    {
        int count = 0, i;
        Arrays.sort(arr);
     
        /* code to remove duplicates from arr[] */
       
        System.out.println(Arrays.toString(arr));
        
        // Pick a first element point
        for (i = 0; i < n-1; i++) {
            System.out.println(arr[i] + k);
            if (binarySearch(arr, i+1, n-1, arr[i] + k) != -1) {
                System.out.println("increment count : "+i);
                count++;
            }
        }
     
        return count;
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int  arr[] = {1, 5, 3, 4, 2};
        int k=3;
        int length = arr.length;
        // TODO Auto-generated method stub

        System.out.println(SumArrayFind.countPairsWithDiffK(arr, length, k));
    }

}
