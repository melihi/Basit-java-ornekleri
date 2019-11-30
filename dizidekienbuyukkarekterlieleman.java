import java.util.Scanner;

public class dizidekienbuyukkarekterlieleman {
        public static void main(String[] args) {
            Scanner k = new Scanner(System.in);
            String[] a = new String[10];
            String enb = a[0];
            for (int i = 0; i <= 9; i++) {
                String kelime = k.next();
                a[i] = kelime;


            }
            for(int i=0;i<=9;i++){
                for (int j=0;j<=9;j++){
                    if(a[j].length()>a[i].length()){
                        a[i]="";
                    }
                }
            }
            //A dizisini yazdırır
            for(int i=0;i<=9;i++) {
                if (a[i]!=""){
                    System.out.println(a[i]);
                }

            }




        }
























}
