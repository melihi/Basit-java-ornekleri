import java.util.Scanner;

public class tanertamer {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a1 = k.next();
        String a2 = k.next();
        String str = "";
        for (int i = 0; i < a1.length(); i++) {

            if (a1.charAt(i) == a2.charAt(i)) {
                str +=a1.charAt(i);

            }


        }
        System.out.println(str);
    }
}
