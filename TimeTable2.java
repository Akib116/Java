package beginerjava;

import java.util.Scanner;

public class TimeTable2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i,m,j;
        System.out.print("Enter first number :");
        m=input.nextInt();
        System.out.print("Enter last number :");
        n=input.nextInt();
        for(i=m;i<=n;i++){
        for(j=1;j<=10;j++){
            
            System.out.println(i+"X"+j+"="+j*i);
        }
            System.out.println("  ");
    }
    
}
}