import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner arda = new Scanner(System.in);
        int angkaMahasiswa;
        System.out.print("Masukan Jumlah mahasiswa: ");
        angkaMahasiswa = arda.nextInt();

        String[] kumpulanMahasiswa = new String[angkaMahasiswa];

        System.out.println("Masukan Nama Mahasiswa");


        for(int i=0;i<kumpulanMahasiswa.length;i++)
        {
            System.out.print("Mahasiswa ke "+(i+1)+" : ");
            kumpulanMahasiswa [i]=arda.next();
        }

        for(int i=0;i<kumpulanMahasiswa.length;i++)
        {
            System.out.print(kumpulanMahasiswa[i]);
            System.out.print('\n');

        }

        for(String u : kumpulanMahasiswa)
        {
           if ((u.contains("a"))||(u.contains("i"))){
               System.out.println("Mahasiswa " + u + " Terdapat a atau i");
           }else {
               System.out.println("Mahasiswa " + u + " Tidak terdapat a atau i");
           }
        }


    }
}