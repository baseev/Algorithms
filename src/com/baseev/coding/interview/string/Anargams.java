package com.baseev.coding.interview.string;

public class Anargams
{

    public static boolean isAnargam1(String s, String t)
    {
        // return sort(s) == sort(t);
        return false;
    }

    public static boolean isAnargam2(String s, String t)
    {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_t = 0;
        char[] s_array = s.toCharArray();

        for (char c : s_array) { // count number of each char in s.
            if (letters[c] == 0) {
                ++num_unique_chars;
            }
            ++letters[c];
        }
        
        //System.out.println(num_unique_chars+" --> "+letters.length);
               
        for (int i = 0; i < t.length(); ++i) {
            int c = (int) t.charAt(i);
            if (letters[c] == 0) {
                return false;
            }
            --letters[c];
            System.out.println("letters[c] :: "+letters[c]+", c = "+c);
            if (letters[c] == 0) {
                ++num_completed_t;
                System.out.println(num_completed_t+" :: "+num_unique_chars);
                if (num_completed_t == num_unique_chars) {
                    return i == t.length() - 1;
                }
            }
        }
        return false;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(Anargams.isAnargam2("geeksforgeeksa", "forgeeksgeeksa"));
    }

}
