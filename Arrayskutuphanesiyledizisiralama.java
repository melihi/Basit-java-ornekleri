import java.util.Arrays;
import java.util.Scanner;

public class Arrayskutuphanesiyledizisiralama {
    public static void main(String[] args) {
            Scanner k = new Scanner(System.in);
            int [] veri={1,2,6,5,4,9,7,3,8};
            Arrays.sort(veri,0,9);

            for(int i=0;i<=veri.length-1;i++){
                System.out.println(veri[i]);


            }
        }
}
