import java.util.Scanner;

public class perulanganLatihan {
    public static void main(String[]args){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(6);
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        Scanner arda = new Scanner(System.in);
        String[] belanja = new String[10];


        for (int i = 0; i < belanja.length; i++){
            System.out.println("Masukna");
            belanja[i] = arda.nextLine();
        }

    }
}
