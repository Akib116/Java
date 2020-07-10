
package beginerjava;

import java.util.Scanner;

public class Pattern2 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,row,col;
        System.out.print("Enter any number :");
        n=input.nextInt();
        
        for(row=n;row>=1;row--){
        for(col=1;col<=row;col++){
            System.out.print(" "+col);
        }
            System.out.println();}
    }
        
}
