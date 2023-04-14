import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        int choice;

        do {
            System.out.println("ATM Menüsü");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen seçim yapınız: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Bakiyeniz: %.2f TL%n", balance);
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz tutar: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("Yeni bakiyeniz: %.2f TL%n", balance);
                    }
                    break;
                case 3:
                    System.out.print("Yatırmak istediğiniz tutar: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.printf("Yeni bakiyeniz: %.2f TL%n", balance);
                    break;
                case 4:
                    System.out.println("İyi günler!");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        } while (choice != 4);
    }
}