

import java.util.Scanner;
public class pozitifleribulur {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);


        for(int i=1;i<=5;){
            int a=k.nextInt();
            if (a>0){
                ++i;
                System.out.println(a);


            }


        }
    }
}


