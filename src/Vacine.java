import java.util.Random;
import java.util.Scanner;

public class Vacine {
    int JumlahVaksin = 3;
    static int jumlahPenerimaVaksin = 12;
    public static String[] Pfizzer = new String[4];
    public static String[] Sinzorma = new String[4];
    public static String[] Moderna = new String[4];

    public static void PrintInfoPasienVaksin(){
        int totalPrizzer = 0;
        int sisKouta = 0;
        for (int index = 0; index< Pfizzer.length; index++){
            if (Pfizzer[index] != null){
                totalPrizzer++;
            }
        }
        int totalSinzorma = 0;
        for (int index = 0; index< Sinzorma.length; index++){
            if (Pfizzer[index] != null){
                totalSinzorma++;
            }
        }
        int totalModerna = 0;
        for (int index = 0; index< Moderna.length; index++){
            if (Pfizzer[index] != null){
                totalModerna++;
            }
        }

        sisKouta = jumlahPenerimaVaksin - totalPrizzer - totalSinzorma - totalModerna;
        System.out.println("Total Pasien Prrizzer : " + totalPrizzer + " | total Pasien Sinzorma :" + totalSinzorma + "| Total Pasien moderna :" + totalModerna  );
        System.out.println("Jumlah Seluruh Vaksin : " + jumlahPenerimaVaksin + " Sisa Kouta :" + sisKouta);
        System.out.println();

    }

    public static void CheckIndexArray(String[] myArray,String Pasien){
        int indexNow = 0;
        for (int index = 0; index<myArray.length; index++){
            if (myArray[index] != null){
                indexNow = index+1;
            }
        }
        if(indexNow < myArray.length){
       myArray[indexNow] = Pasien;
        }

    }

    public static void simpanPasien(int AngkaRandom, String Pasien){
         switch (AngkaRandom){
             case 1:
                 CheckIndexArray(Pfizzer,Pasien);
                 System.out.println("ANDA MENDAPAT VAKSIN PFIZZER");
                 PrintInfoPasienVaksin();
                 break;
             case 2:
                 CheckIndexArray(Sinzorma,Pasien);
                 System.out.println("ANDA MENDAPAT VAKSIN SINZORMA");
                 PrintInfoPasienVaksin();
                 break;
             case 3:
                 CheckIndexArray(Moderna,Pasien);
                 System.out.println("ANDA MENDAPAT VAKSIN Moderna");
                 PrintInfoPasienVaksin();
                 break;

         }
    }

public static void inputPasien(){
    Scanner scan = new Scanner(System.in);
    while (true){
        System.out.print("Nama Pasien:");
        String NamaPasien = scan.nextLine();
        if (NamaPasien.isBlank()){
            System.out.println("Nama Pasien wajib diisi");
            inputPasien();
        }else {
            Random hasilRandom = new Random();
            int JenisRandom = hasilRandom.nextInt(3)+1;
            simpanPasien(JenisRandom,NamaPasien);

        }

    }
}
public static void main(String[]args){
        inputPasien();


}

}
