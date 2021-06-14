package JavaKDV;
import java.util.Scanner;

public class JavaKDV {
    public static void main(String[] args) {
        double input, kdv;
        Scanner s = new Scanner(System.in);
        System.out.print("KDV'sini hesaplamak istediğiniz tutarı giriniz: ");
        input =s.nextDouble();

        kdv = (input < 1000) ? 0.18 : 0.08;

        System.out.println("Girdiğiniz miktar: " + input);
        System.out.println("KDV yüzdesi: %" + kdv * 100);
        System.out.println("KDV'li miktar: " + (input + (input * kdv)));
        System.out.println("Eklenen KDV miktarı: " + input * kdv);
    }


}
