
package beginerjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i,fact=1;
        System.out.print("Enter any positive integer number :");
        n=input.nextInt();
        for(i=n;i>=1;i=i-1){
        fact=fact*i;
            System.out.println(i);}
        System.out.println("factorial="+fact);
    }
    
}
