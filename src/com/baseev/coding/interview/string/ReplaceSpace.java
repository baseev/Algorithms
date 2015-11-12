package com.baseev.coding.interview.string;

public class ReplaceSpace
{

    /**
     * Complexity is O(m*n)
     * @param str
     * @param length
     * @return
     */
    public static String ReplaceSpace1(String data)
    {
        char[] str = data.toCharArray();
        int length = str.length;
        int spaceCount = 0, newLength, i = 0;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        
        newLength = length + (spaceCount * 2);
        char [] newstr = new char[newLength];
        //newstr[newLength -1]= '\0';
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                newstr[newLength - 1] = '0';
                newstr[newLength - 2] = '2';
                newstr[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                newstr[--newLength] = str[i];
            }
        }
        
        return new String(newstr);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(ReplaceSpace.ReplaceSpace1("abaca india kerala"));
    }

}
