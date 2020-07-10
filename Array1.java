
package array.java;

public class Array1 {
    public static void main(String[] args) {
        int[]number= new int[100];
        
        number[0]=20;
        number[1]=40;
        number[2]=60;
        number[3]=40;
        number[4]=40;
        
        int len=number.length;
        System.out.println("Array size :"+len);
        
        int sum=number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("sum of number :"+sum);
        
    }
    
}
