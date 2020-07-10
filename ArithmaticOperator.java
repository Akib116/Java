
package beginerjava;
import java.util.Scanner;

public class ArithmaticOperator {
  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int num1,num2,result;
        System.out.println("Enter frist number :");
        num1=input.nextInt();
        System.out.println("Enter second number :");
        num2=input.nextInt();
             
        
         result=num1+num2;
         System.out.println("sum="+result);
         result=num1-num2;
         System.out.println("sub="+result);
         result=num1*num2;
         System.out.println("multi="+result);
         result=num1/num2;
         System.out.println("div="+result);
         result=num1%num2;
         System.out.println("remainder="+result);
    }
}
