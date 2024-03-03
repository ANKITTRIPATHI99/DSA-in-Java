package BasicPrograms;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(palindromeNumber(n));


    }
    
    
        public static boolean palindromeNumber(int n){
            // Write your code here.
             int r, sum=0;
            
            int temp = n;
            
             while(n>0){
                        r = n % 10;
                        
                        sum = (sum * 10) + r;
                        
                        n = n/10;
            }
            
            if(sum == temp ){
                return true;
            }
            else{
                 return false;
            }
        }
    }

