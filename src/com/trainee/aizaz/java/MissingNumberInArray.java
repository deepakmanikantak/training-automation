package com.trainee.aizaz.java;

/**
 * The purpose of this program is to find missing number
 * in the series of 1 to n.
 */
public class MissingNumberInArray
{
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int missedSum=0;
        for(int i=0;i<arr.length;i++){
            missedSum=missedSum+arr[i];
        }
        int missingNumber=sum-missedSum;
        System.out.println(missingNumber);
    }
}