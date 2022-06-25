package com.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintAnySubsequenceWithSumK {

    private boolean subsequence(int index , List<Integer> list ,int [] arr , int sum , int n , int target){
        if(n== index){
            if(sum == target){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum += arr[index];
        if(subsequence(index+1,list,arr,sum,n,target))
            return true;
        sum -= arr[index];
        list.remove(list.size()-1);
        if(subsequence(index+1,list,arr,sum,n,target))
            return true;
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,1};
        List<Integer> list = new ArrayList<>();
        PrintAnySubsequenceWithSumK printAnySubsequenceWithSumK = new PrintAnySubsequenceWithSumK();
        printAnySubsequenceWithSumK.subsequence(0,list,arr,0,arr.length,2);
    }
}
