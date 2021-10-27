package odev;

public class BubbleSort {
    public static void main(String[] args) {
        int[] dizi = new int[6];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i] = (int) (Math.random() * 21);
        }
        int temp;
        for (int i = 0; i < dizi.length ; i++) System.out.printf("%3d", dizi[i]);
        System.out.println();
        {
            for (int i = 0; i < dizi.length - 1 ; i++) {
                for (int j = 0; j < dizi.length - 1 - i; j++) {
                    if (dizi[j] > dizi[j + 1]) {
                        temp = dizi[j];
                        dizi[j] = dizi[j + 1];
                        dizi[j + 1] = temp;
                    }
                }

            }
            for (int i = 0; i < dizi.length ; i++) System.out.printf("%3d", dizi[i]);

        }
    }
}
