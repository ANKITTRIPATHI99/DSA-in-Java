package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

          System.out.println("Enter the no of elements in array");

          int n = sc.nextInt();

          System.out.println("Enter the elemets of  array");

          int arr[] = new int[n];

          for(int i=0; i<n; i++){
              arr[i]=sc.nextInt();
          }
          System.out.println("Enter the target element");
          int x = sc.nextInt();
          int idx = -1;
          for(int i=0; i<n; i++){
            if(arr[i]==x){
                idx = i;
            }
          }
         if(idx == -1 ){
            System.out.println("Elements not found in an array!!");
         }

         else{
            System.out.println("Searched Elements found at indx " + idx);
         }
          
        }
    }
        

    

    

