package com.trainee.geetanjali.java;

public class RemoveELementsOfOneStringInAnotherString {
    public static void main(String args[]) {
        String str1 = "the quick brown fox";
        String str2 = "queen";
        System.out.println("The given string is: " + str1);
        System.out.println("The given mask string is: " + str2);
        char arr[] = new char[256];
        for (int i = 0; i < str2.length(); i++){
            arr[str2.charAt(i)]++;}
        System.out.println("\nThe new string is: ");
        for (int i = 0; i < str1.length(); i++) {
            if (arr[str1.charAt(i)] == 0){
                System.out.print(str1.charAt(i));}
        }
    }
}
/*
public static void mail(String args[]){
        String str1 = "the quick brown fox";
        String str2 = "queen";
        char arr1[]=str1.tocharArray();
                char arr2[]=str2.tocharArray();
                char result[]=new char[256];
                for(int i=0;i<arr1.length;i++){
                   for(int j=0;j<arr2.length;j++){
                      if(arr2[j]!=arr1[i]){
                      res[i]=arr1[i]}
                      }
                      }


 */
