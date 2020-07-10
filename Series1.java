
package beginerjava;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i,sum=1;
        System.out.print("Enter the last number :");
        n=input.nextInt();
        
        for(i=1;i<=n;i=i+1){    //1+2+3....n,//1+3+5...n,//2+4+6...n,//1.5+2.5+3.5.....n
//1^2+2^2+3^2.....n
                                                          
            System.out.println(i+"X"+i);
            sum=sum+i*i;
            
            }
        System.out.println("sum= "+sum);
        
        
    }
}
