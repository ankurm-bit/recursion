package com.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequenceWithSumK {

    private void subsequenceWithSumK(int index , List<Integer> list,int sum ,int [] arr, int n , int target){
        if(index == n ){
            if(sum == target)
                System.out.println(list);
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        subsequenceWithSumK(index+1,list,sum,arr,n,target);
        list.remove(list.size()-1);
        sum -= arr[index];

        subsequenceWithSumK(index+1,list,sum,arr,n,target);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        List<Integer> list = new ArrayList<>();
        PrintAllSubsequenceWithSumK printAllSubsequenceWithSumK = new PrintAllSubsequenceWithSumK();
        printAllSubsequenceWithSumK.subsequenceWithSumK(0,list,0,arr,arr.length,2);
    }
}
