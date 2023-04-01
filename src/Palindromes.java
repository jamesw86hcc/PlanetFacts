import java.util.Scanner;
import java.util.Scanner.*;
public class Palindromes {


    /*public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word to check if it is a palindrome: ");
        String palindrome = input.nextLine();
        System.out.print(palindrome + " is ");
        if (!isPalindrome(palindrome))
        {
            System.out.print("not ");
        }
        System.out.println("a palindrome.");
    }*/

    public static boolean isPalindrome(String word){

        word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");

        if (word.length() == 1 || word.length() == 0)
        {
         return true;
        } else {
            if (word.charAt(0) == word.charAt(word.length()-1))
            {
                return isPalindrome(word.substring(1,word.length()-1));
            } else
            {
                return false;
            }
        }
    }
}
