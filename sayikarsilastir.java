import javax.swing.*;
import java.util.Scanner;
public class sayikarsilastir {
    public static void main(String args[]){
        Scanner k =new Scanner(System.in);
        int ilk=k.nextInt();




        for (int i=2;i<=10;i++){
            int sayi = k.nextInt();
            int sayi2=ilk;
            if (sayi == sayi2){
                sayi2=sayi;
            }
            else{
                System.out.println("Eşit değil dongu bitti");


            }
        }
    }
}
