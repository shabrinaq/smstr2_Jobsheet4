import java.util.Scanner;

/**
 * MainFaktorialNada1
 */
public class MainFaktorialNada1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("MAsukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        FaktorialNada1 [] fk = new FaktorialNada1[elemen];

        for (int i = 0; i < elemen; i++) {
            fk[i] = new FaktorialNada1();
            System.out.print("Masukkan nila data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        
        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.println("=======================================================");        
    }
}