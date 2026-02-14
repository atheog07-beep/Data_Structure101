package mydata;
import java.util.Arrays;
public class MyData {
    public static void main(String[] args) {
        int[] Yokuwi = {10, 20,30,40,50,60,70,80,90,100};
        int jumlah = 0;
        for (int i = 0; i < Yokuwi.length; i++) {
            jumlah += Yokuwi[i];
        }
        double rerata = (double) jumlah / Yokuwi.length;
        System.out.println("Yokuwi = " + Arrays.toString(Yokuwi));
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Rata-rata = " + rerata);
    }
}
