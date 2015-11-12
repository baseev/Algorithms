package com.baseev.coding.interview.string;

public class ReverseString
{

    public static String reverse1(String s) {
        char[] array = s.toCharArray();
        char tmp;
        for(int i=array.length/2; i >= 0; i--) {
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        return new String(array);
    }
    
    /**
     * Correct solution works with O(n)
     * @param s
     * @return
     */
    public static String reverse2(String str) {
        int length = str.length();
        char[] array = new char[length];
        for(int i= length-1, j=0; i>=0; i--, j++) {
            array[j] = str.charAt(i);
        }
        return new String(array);
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String str = "baseev";
        System.out.println(reverse2(str));
    }

}
