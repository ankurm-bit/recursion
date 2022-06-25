package com.recursion;

public class PrintNameNtimes {

    private final int LIMIT = 5 ;

    private void printName(int n){
        if(n == LIMIT)
            return;
        n++;
        System.out.println("Hello");
        printName(n);
    }

    public static void main(String[] args) {
        PrintNameNtimes printNameNtimes = new PrintNameNtimes();
        printNameNtimes.printName(1);
    }
}
