package Tasks;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(){
        int x;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        long reversedNumber =0;
        int originalNumber = x;
        while (originalNumber>0){
int remainder = originalNumber%10;
reversedNumber = reversedNumber*10 + remainder;
originalNumber = originalNumber/10;
        }
        if (reversedNumber==x){
            System.out.println("palindrome");
            return true;
        }else {
            System.out.println("not palindrome");
            return false;
        }
    }
}
