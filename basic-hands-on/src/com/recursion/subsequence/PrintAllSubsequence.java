package com.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {

    private void subsequence(int index,List<Integer> list,int [] arr, int n ){
        if(index == n){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subsequence(index+1,list,arr,n);
        list.remove(list.size()-1);
        subsequence(index+1,list,arr,n);
    }

    public static void main(String[] args) {
        int [] arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        PrintAllSubsequence printAllSubsequence = new PrintAllSubsequence();
        printAllSubsequence.subsequence(0,list,arr,arr.length);
    }
}
