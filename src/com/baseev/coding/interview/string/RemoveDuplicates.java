package com.baseev.coding.interview.string;

public class RemoveDuplicates
{

    /**
     * Remove duplicates with O(n^2)
     * 
     * @param str
     */
    public static void removeDuplicates1(char[] str) {
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;

        int tail = 1;
        for(int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if(j == tail) {
              str[tail] = str[i];
              ++tail;
            }

        }
        str[tail] = 0;
        System.out.println(str);
    }
    
    
    /**
     * This method takes complexity of O(m*n)
     * @param str
     */
    public static void removeDuplicates2(char[] str) {
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;
        boolean hit[] = new boolean[256];
        for(int i=0; i<256; i++) {
            hit[i] = false;
        }
        
        hit[str[0]] = true;
        int tail = 1;
        for(int i=1; i<len; i++) {
            if(!hit[str[i]]) {
                str[tail] = str[i];
                tail++;
                hit[str[i]] = true;
            }
        }
        str[tail] = 0;

        System.out.println(str);
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String str = "indaia";
       removeDuplicates2(str.toCharArray());
    }
}