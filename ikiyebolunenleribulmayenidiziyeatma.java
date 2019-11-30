

import java.util.Scanner;
public class ikiyebolunenleribulmayenidiziyeatma {
public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int [] a={1,2,5,4,9,6,8};
        int [] b={1,2,3,6};
        int [] yeni =new int[10];
        int sayac=0;//yeni nin index sayıcısı
        for(int i=0;i<=a.length-1;i++){
        if(a[i]%2==0){
        yeni[sayac]=a[i];
        sayac +=  1;
            }
        }

        for(int i=0;i<=b.length-1;i++){
            if(b[i]%2==0){
            sayac+=1;
            yeni[sayac]=b[i];
            }
        }
        for(int i=0;i<=yeni.length-1;i++) {
            if (yeni[i] != 0) {
                System.out.println(yeni[i]);
                }
                }
            }
        }






















