
package beginerjava;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r,temp,sum=0,num;
        System.out.print("Enter any number :");
        num=input.nextInt();
        temp=num;
         while(temp!=0){
         r=temp%10;
         sum=sum+r*r*r;            //153=1^3+5^3+3^3
         temp=temp/10;}
        
         
         if(num==sum){
             System.out.println("Armstrong number :"+sum);}
         
         else{
             System.out.println("Not Armstrong number :"+sum);}
    }
    
}    

