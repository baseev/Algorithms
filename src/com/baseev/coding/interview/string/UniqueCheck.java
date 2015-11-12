package com.baseev.coding.interview.string;

public class UniqueCheck{
    
    /**
     * Runs at o(n) time complexity
     * 
     * @param str
     * @return
     */
    public static boolean check1(String str) {
        boolean[] char_str = new boolean[256];
        for(int i=0; i< str.length(); i++) {
            int val = str.charAt(i);
            if(char_str[val]) return false;
            char_str[val] = true;
        }
        return true;
    }

    /**
     * Runs at o(n) time complexity
     * 
     * @param str
     * @return
     */
    public static boolean check2(String str) {
        boolean[] char_str = new boolean[256];
        for(int i=0; i< str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if(char_str[val]) return false;
            char_str[val] = true;
        }
        return true;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String str = "baseev";
        System.out.println(check1(str));
    }

}
