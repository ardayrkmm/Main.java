import java.util.Scanner;

public class LtMethod {
    public static void jumlah(int x, int y) {
        int hasil_jumlah = x + y;
        System.out.println(hasil_jumlah);
    }

    public static void main(String[]args){
//        jumlah(8,9);

        Scanner inputData = new Scanner(System.in);
        System.out.println("Masukan data 1 : ");
        int angka1 = inputData.nextInt();
        System.out.println("Masukan data 2 : ");
        int angka2 = inputData.nextInt();
        jumlah(angka1,angka2);
    }
}
