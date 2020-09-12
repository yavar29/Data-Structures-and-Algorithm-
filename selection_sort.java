package com.company.sorting;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] intArray= {1,56,75,-45,-22,12};
        int lastNum= intArray.length - 1;
        while(lastNum > 0){
            int maximum= 0;
            for(int i=1; i<= lastNum; i++) {
                if (intArray[i] > intArray[maximum]) {
                    maximum = i;
                }
            }
            swap(intArray, maximum , lastNum);
            lastNum--;
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int array[], int a, int b){
        if(a==b){
            return;
        }
        int temp= array[a];
        array[a] =array[b];
        array[b]= temp;
    }
}