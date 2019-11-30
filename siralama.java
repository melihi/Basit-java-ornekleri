

import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int [] veri={1,2,6,5,8,9,7,3,4};


        for(int i=0;i<=veri.length-1;i++){
            for(int j=1;j<=8;j++){
                if(veri[j]>veri[i]){
                    int enb=veri[j];
                    veri[j]=veri[i];
                    veri[i]=enb;
                }


            }

        }
        for(int i=0;i<=veri.length-1;i++){
            System.out.println(veri[i]);
        }
    }
}





















