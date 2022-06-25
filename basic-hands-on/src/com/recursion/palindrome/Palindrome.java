package com.recursion.palindrome;

public class Palindrome {

    private static boolean check(int i , String str,int n){
        if(i >= n/2)
            return true;
        if(str.charAt(i) != str.charAt(n-i-1))
            return false;
        return check(i+1,str,n);
    }

    public static void main(String[] args) {
        System.out.println(check(0,"ANKUR",5));
    }
}
