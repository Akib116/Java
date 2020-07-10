
package beginerjava;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {            //num=121
                                                         //reverse=121
        Scanner input= new Scanner(System.in);
        int r,temp,sum=0,num;
        System.out.print("Enter any number :");
        num=input.nextInt();
        temp=num;
         while(temp!=0){
         r=temp%10;
         sum=sum*10+r;
         temp=temp/10;}
         
         if(num==sum){
             System.out.println("palindrome number"+sum);}
         
         else{
             System.out.println("Not palindrome number :"+sum);}
    }
    
}
