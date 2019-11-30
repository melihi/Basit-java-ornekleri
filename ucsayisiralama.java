import java.util.Scanner;
public class ucsayisiralama {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        int sayi3 = k.nextInt();
        int sayi2 = k.nextInt();
        int sayi = k.nextInt();
        int enb=0,enb2=0,enb3=0;
        if (sayi > sayi2 && sayi > sayi3) {
            enb=sayi;
            if(sayi2>sayi3){ enb2=sayi2;enb3=sayi3;}
            else{
                enb2=sayi3;enb3=sayi2;
            }
        }if (sayi2 > sayi && sayi2 > sayi3) {
            enb=sayi2;
            if(sayi>sayi3) {enb2=sayi;enb3=sayi3;}
            else{
                enb2=sayi3;enb3=sayi;
            }
        }if (sayi3>sayi && sayi3>sayi2){
            enb=sayi3;
            if(sayi2>sayi) {enb2=sayi2;enb3=sayi;}
            else{
                enb2=sayi;enb3=sayi2;
            }
        }
        System.out.println(enb+" "+enb2+" "+enb3);
    }
}

