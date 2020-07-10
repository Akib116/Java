
package beginerjava;

import java.util.Scanner;

public class VowelConsonent2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any Vowel :");
        ch = input.next().charAt(0);
        
        if(ch=='e' || ch=='a' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println("Vowel");
    }
        else{
              System.out.println("Consonent"); }
        
        
    
    
}
}