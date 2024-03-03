package Patterns;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
             
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

    int space = n-1; 
         for(int i=0; i<n; i++){

        
            for(int j=1;j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
           space--;
         }
             space=0;
            for(int i=n; i>0; i--)
            {
               
            
            for(int j=1;j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
            space++;
         } 
    
}
}
