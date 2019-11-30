import java.util.Scanner;
public class kdv {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
        float para=0;
        para = k.nextFloat();


        float kdv=para * 18/100;
        System.out.println("ödemeniz gereken kdv :"+kdv);

    }
}
