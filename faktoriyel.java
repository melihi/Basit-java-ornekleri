import java.util.Scanner;

public class faktoriyel {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        int deger = k.nextInt();
        int fak=1;
        for (int i=1;i<=deger;i++) {
            fak = fak*i;

        }
        System.out.println(fak);
    }
}