
package beginerjava;

import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any positive integer :");
        num=input.nextInt();
        
        if(num%2==0){
            System.out.println("even");}
            else if(num%2!=2){
                System.out.println("odd");
            }
    }
    
}
