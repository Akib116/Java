
package beginerjava;

import java.util.Scanner;

public class primenumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,i,j,count=0,totalnumber=0;
        System.out.println("Enter first number :");
        m=input.nextInt();
        System.out.println("Enter last number :");
        n=input.nextInt();
        
        for(i=m;i<=n;i++){
        for(j=2;j<i-1;j++){
            if(i%j==0){
            count++;
            break;}
        }
        
        if(count==0){
                System.out.println(i);
        totalnumber++;}
        count=0;
        }
        System.out.println("Total number of prime"+totalnumber);
    }
    
}
