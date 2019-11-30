

import java.util.Scanner;
public class alibulma {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        String a=k.nextLine();

        for(int i=0;i<a.length();i++){


            if (a.charAt(i) =='a'){
                if (a.charAt(i+1) =='l'){
                    if(a.charAt(i+2)=='i'){
                        System.out.println("ali var");
                    }
                }
            }
        }
    }
}

