package com.trainee.aizaz.java;

public class AverageArray extends CommonMethods {
    public static void main(String[]args){
        AverageArray a=new AverageArray();
       int[]arr= a.arraySet();
       int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float average=(float)sum/arr.length;
        System.out.println("average of array elements is "+average);
    }
}
