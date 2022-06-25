package com.recursion.reverse.array;

public class ArrayReverse {
    static int [] a = {1,2,3,4,5};
    private static void reverse(int i,int n){
        if(i >= n/2)
            return ;
        swap(i,n-i-1);
        reverse(i+1,n);
    }

    private static void swap(int left, int right){
        int temp = a[left];
        a[left]= a[right];
        a[right] = temp;
    }

    public static void main(String[] args) {
        System.out.println("======= Before Reversing ========== ");
        for(int i1 :a)
            System.out.print(i1+" ");
        System.out.println();
        reverse(0,a.length);
        System.out.println("========= After reversing ========= ");
        for (int i1 : a)
            System.out.print(i1+" ");
    }
}
