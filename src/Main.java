import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kM, age, fly;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe giriniz (km):");
        kM = input.nextInt();

        System.out.print("Yaşınız:");
        age = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1-Tek Yön / 2-Gidiş-Dönüş):");
        fly = input.nextInt();

        if (((kM < 0) || (age < 0)) || ((fly < 0) || (fly > 2))) {
            System.out.println("Hatalı Giriş Yaptınız!");
        } else if (age < 12) {
            if (fly == 1) {
                total = ((kM * 0.10) - ((kM * 0.10) * 0.50));
                System.out.println("Toplam Tutar: " + total + " TL");
            } else if (fly == 2) {
                total = (((kM * 0.10) - ((kM * 0.10) * 0.50)) - (((kM * 0.10) - ((kM * 0.10) * 0.50)) * 0.20)) * 2;
                System.out.println("Toplam Tutar: " + total + " TL");
            }
        } else if ((age >= 12) && (age <= 24)) {
            if (fly == 1) {
                total = ((kM * 0.10) - ((kM * 0.10) * 0.10));
                System.out.println("Toplam Tutar: " + total + " TL");
            } else if (fly == 2) {
                total = (((kM * 0.10) - ((kM * 0.10) * 0.10)) - (((kM * 0.10) - ((kM * 0.10) * 0.10)) * 0.20)) * 2;
                System.out.println("Toplam Tutar: " + total + " TL");
            }
        } else if ((age > 24) && (age < 65)) {
            if (fly == 1) {
                total = (kM * 0.10);
                System.out.println("Toplam Tutar: " + total + " TL");
            } else if (fly == 2) {
                total = (((kM * 0.10) - ((kM * 0.10) * 0.20))) * 2;
                System.out.println("Toplam Tutar: " + total + " TL");
            }
        } else if (age >= 65) {
            if (fly == 1) {
                total = ((kM * 0.10) - ((kM * 0.10) * 0.30));
                System.out.println("Toplam Tutar: " + total + " TL");
            } else if (fly == 2) {
                total = (((kM * 0.10) - ((kM * 0.10) * 0.30)) - (((kM * 0.10) - ((kM * 0.10) * 0.30)) * 0.20)) * 2;
                System.out.println("Toplam Tutar: " + total + " TL");
            }
        }
    }
}
