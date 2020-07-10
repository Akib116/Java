
package beginerjava;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0,i;
        System.out.println("Enter any number :");
        
        num=input.nextInt();
        for(i=2;i<num;i++){
        if(num%i==0){
            count++;
            break;}}
        if(count==0){
            System.out.println("prime number");}
        else{
            System.out.println("not prime number");
        }
    }
    
    }
