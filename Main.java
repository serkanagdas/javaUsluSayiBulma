import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double n, r, netice;

        System.out.print("Lütfen kuvvetini almak istediğiniz sayıyı yazınız: ");
        n = scn.nextDouble();

        System.out.print("Lütfen kuvvetini yazınız: ");
        r = scn.nextDouble();

        netice=n;

        for (double i=1; i<r; i++){
            netice=netice*n;
        }
        System.out.print("Sonuç: "+netice);
    }
}