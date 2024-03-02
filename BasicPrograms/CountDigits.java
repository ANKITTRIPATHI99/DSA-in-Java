package BasicPrograms;

import java.util.Scanner;

public class CountDigits {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            // Write your code here.
            
    // 1st method:
           
            int count=0;
            while(n>0){
                n=n/10;
                count++;
            }
            System.out.println(count);
    
    // 2nd Method:
    
        //   int x = (int)(Math.log10(n) +1);
        //   return x;
    
    // 3rd Method
           
            //  String N = Integer.toString(n);
    
            //  return N.length();
    
    
        }
           
    }
    
    

