
import java.util.Scanner;
public class karaktersayi5tenbuyuk {
    public static void main(String args[]){
        Scanner k=new Scanner(System.in);
        for (int i=0;i<=20;i++){
            String kelime=k.nextLine();
            if(kelime.length()>=5){
                System.out.println(kelime);
            }else{
                System.out.println("5 karakterden kucuk !");
            }

        }
    }
}
