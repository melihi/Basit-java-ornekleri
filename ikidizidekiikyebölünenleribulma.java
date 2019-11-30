public class ikidizidekiikyebölünenleribulma {
    public static void main(String[] args) {

        int[] a = {1, 2, 5, 4, 9, 6};
        int[] b = {1, 2, 3, 6};

        for (int i = 0; i <= a.length - 1; i++) {

            if (a[i] % 2 != 0) {
                a[i] = 0;
            }
        }
        for (int i = 0; i <= b.length - 1; i++) {

            if (b[i] % 2 != 0) {
                b[i] = 0;
            }
        }
        for (int i = 0; i <= 5; i++) {

            if (a[i] != 0) {
                System.out.println(a[i]);

            }
        }
        for (int i = 0; i <= 3; i++) {

            if (b[i] != 0) {
                System.out.println(b[i]);
            }
        }
    }
}






















