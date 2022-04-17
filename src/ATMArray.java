import java.util.ArrayList;
import java.util.Scanner;

public class ATMArray {
    public static void main(String[] args) {
        ArrayList<KartuATM> daftarKartuATM = new ArrayList<KartuATM>();
        for (int index=0;index<3;index++){
            KartuATM atmku = new KartuATM();
            Scanner inputDetail = new Scanner(System.in);
            System.out.println("Masukkan No ATM : ");
            atmku.nomer = inputDetail.nextLine();

            System.out.println("Masukkan No Rekening :");
            atmku.norek = inputDetail.nextLine();

            System.out.println("Masukkan Nama : ");
            atmku.nama = inputDetail.nextLine();
            
            System.out.println("Masukkan Bank : ");
            atmku.nama_bank = inputDetail.nextLine();

            daftarKartuATM.add(atmku);
        }

        for(int i=0;i<daftarKartuATM.size();i++){
            String nomerKartu = daftarKartuATM.get(i).nomer;
            String nomerRek = daftarKartuATM.get(i).norek;
            String nama = daftarKartuATM.get(i).nama;
            String namaBank = daftarKartuATM.get(i).nama_bank;
            System.out.println("Kartu yang ke " + i+1);
            System.out.println("Nama Bank : " + namaBank);
            System.out.println("Nomor Kartu : " + nomerKartu);
            System.out.println("Nomor Rekening : " + nomerRek);
            System.out.println("Nama Pemilik : " + nama);
            System.out.println();
        }

    }
}
