import java.util.ArrayList;
import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        String Nama;
        String Email;
        String Password;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama   : ");
        Nama = input.nextLine();

        System.out.println("Masukkan Email  : ");
        Email = input.nextLine();

        System.out.println("Masukkan Password: ");
        Password = input.nextLine();

        if(Password.equals("21090096")){
            char pilihan = 0;
            do {
                System.out.println();
                System.out.println("MESSENGER");
                System.out.println("[1] Kirim Pesan");
                System.out.println("[0] Exit");
                System.out.println("====================");
                System.out.println("Pilihan Anda: " );
                pilihan = input.next().charAt(0);
                switch (pilihan){
                    case '1' -> {
                        System.out.println();
                        Scanner myInput  = new Scanner(System.in);
                        System.out.println("Masukkan Pengirim: ");
                        String sender = myInput.nextLine();

                        System.out.println("Masukkan Penerima: ");
                        String receiver = myInput.nextLine();

                        System.out.println("Masukkan Pesan   : ");
                        String message = myInput.nextLine();

                        Model pesan = new Model(sender, message, receiver);
                        pesan.addItem(pesan);
                        System.out.println();
                        System.out.println("Pesan Terkirim");
                        System.out.println(pesan.getMessage());
                    }
                    default -> {
                    }
                }
            } while (pilihan != '0');
        }
    }
}
