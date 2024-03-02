package Patterns;

import java.util.Scanner;

public class RightAngledTrianglePattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Solution(n);
        }
    
        public static void Solution(int n) {
            // Write your code herefor
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*"+" ");
                }
                 System.out.println();
            }
    
        }
    }

