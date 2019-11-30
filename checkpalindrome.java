import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        String kelime, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.println("palindrom kontrolu.");
        kelime = in.nextLine();

        int length = kelime.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + kelime.charAt(i);

        if (kelime.equals(reverse))
            System.out.println("palindrome.");
        else
            System.out.println("palindrome degil.");
    }
}