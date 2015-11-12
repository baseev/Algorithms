package com.baseev.coding.interview.string;

public class StringRotation
{
    public static boolean checkRotation(String s1, String s2) {
        int len = s1.length();
        if(len == s2.length() && len > 0) {
            String s1s2 = s1+s2;
            return s1s2.toLowerCase().contains(s2);
        }
        return false;
    }
    /**
     * @param args
     */
    public static void main(String[] args)
    {
       System.out.println(checkRotation("india", "iinda"));
    }

}
