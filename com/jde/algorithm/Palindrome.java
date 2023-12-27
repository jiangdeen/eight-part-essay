package com.jde.algorithm;

/**
 * 数组
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(26262));
        System.out.println(p.isPalindrome(2662));
        System.out.println(p.isPalindrome(262));
        System.out.println(p.isPalindrome(2612));
    }

    /**
     * 解题思路,把数字转成字符串,然后再进行反转,和原字符串比较
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] newsc = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char[] sc = s.toCharArray();
            newsc[j] = sc[i];
            j++;
        }
        String s1 = new String(newsc);
        return s.equals(s1);
    }

    /**
     * 利用 StringBuilder 和Stringbuffer. reverse
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        String reversedStr = new StringBuilder(x + "").reverse().toString();
        return  reversedStr.equals(x+"");
    }


}
