package Patterns;

import java.util.Scanner;

public class SquarePattern {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            nForest(n);
        
        }
        public static void nForest(int n) {
            // Write your code here
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    System.out.print("*"+" ");
                }

                 System.out.println();
            }
           
        }
    }

