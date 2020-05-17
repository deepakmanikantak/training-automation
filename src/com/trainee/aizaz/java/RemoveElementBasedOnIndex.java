package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.Scanner;
/**
 * the purpose of the program is to remove a element based on index
 */
public class RemoveElementBasedOnIndex extends CommonMethods {
    public static void main(String[]args){
        RemoveElementBasedOnIndex re=new RemoveElementBasedOnIndex();
        int[] arr=re.arraySet();
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index whose element should be deleted:");
        int index=sc.nextInt();
        int[] arr2=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i!=index){
                arr2[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}