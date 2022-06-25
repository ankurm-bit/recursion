package com.recursion.sum;

public class SumOfNNumbers {

    private static int sum(int n){
        if(n ==0)
            return 0;
        return n + sum(n-1);
    }

    private static void sum(int n , int sum){
        if(n <1){
            System.out.println(sum);
            return ;
        }
        sum(n-1,sum+n);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
        sum(3,0);
    }

}
