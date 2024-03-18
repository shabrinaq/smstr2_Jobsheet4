import java.util.Scanner;

/**
 * MainPangkat21
 */
public class MainPangkat21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah elemen yaang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat21 [] png = new Pangkat21[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat21();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        System.out.println("=======================================================");
    }
}