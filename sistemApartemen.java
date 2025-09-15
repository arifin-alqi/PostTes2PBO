package Service;

import Model.dataApartemen;
import java.util.ArrayList;
import java.util.Scanner;

public class sistemApartemen {
    public static ArrayList<dataApartemen> daftarUnit = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    // Tambah unit baru
    public static void tambahUnit() {
        int id = inputAngka(input, "Masukkan ID Unit: ");
        String tipe = inputTeks(input, "Masukkan Tipe Unit: ");
        int luas = inputAngka(input, "Masukkan Luas Unit (m2): ");
        int hargaSewa = inputAngka(input, "Masukkan Harga Sewa Unit: ");
        int hargaJual = inputAngka(input, "Masukkan Harga Jual Unit: ");

        daftarUnit.add(new dataApartemen(id, tipe, luas, hargaSewa, hargaJual, "Tersedia"));
        System.out.println("Unit berhasil ditambahkan!");
    }

    // Menampilkan semua unit
    public static void tampilkanDaftarUnit() {
        if (daftarUnit.isEmpty()) {
            System.out.println("Belum ada unit apartemen.");
        } else {
            System.out.println("\nDaftar Unit Apartemen:");
            for (dataApartemen unit : daftarUnit) {
                unit.tampilkanInfo();
            }
        }
    }

    // Update status unit
    public static void updateStatusUnit(int id, String statusBaru) {
        for (dataApartemen unit : daftarUnit) {
            if (unit.getId() == id) {
                unit.setStatus(statusBaru);
                System.out.println("\nStatus unit dengan ID " + id + " berhasil diupdate.");
                return;
            }
        }
        System.out.println("\nUnit dengan ID " + id + " tidak ditemukan.");
    }

    // Menu update status
    public static void sistemUpdate() {
        int idUpdate = inputAngka(input, "Masukkan ID Unit yang Ingin Di Update: ");
        String statusBaru = inputTeks(input, "Masukkan status baru (Tersedia/Disewa/Terjual): ");
        updateStatusUnit(idUpdate, statusBaru);
    }

    // Hapus unit
    public static void hapusUnit() {
        System.out.print("Masukkan ID Unit yang ingin dihapus: ");
        int idDelete = Integer.parseInt(input.nextLine());

        dataApartemen unitHapus = null;
        for (dataApartemen unit : daftarUnit) {
            if (unit.getId() == idDelete) {
                unitHapus = unit;
                break;
            }
        }

        if (unitHapus != null) {
            daftarUnit.remove(unitHapus);
            System.out.println("Unit berhasil dihapus!");
        } else {
            System.out.println("Unit dengan ID tersebut tidak ditemukan.");
        }
    }
    
    // fitur search unit berdasarkan tipe
    public static void cariUnitBerdasarkanTipe() {
        System.out.print("\nMasukkan Tipe Unit yang ingin dicari: ");
        String tipeCari = input.nextLine();

        boolean ketemu = false;
        for (dataApartemen unit : daftarUnit) {
            if (unit.getTipe().equalsIgnoreCase(tipeCari)) {
                unit.tampilkanInfo();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Unit dengan tipe \"" + tipeCari + "\" tidak ditemukan.");
        }
    }
    
        // validasi input angka (hanya terima int)
    public static int inputAngka(Scanner input, String pesan) {
        int angka;
        while (true) {
            System.out.print(pesan);
            String str = input.nextLine();
            try {
                angka = Integer.parseInt(str);
                break; // berhasil parse → keluar loop
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Coba lagi!");
            }
        }
        return angka;
    }

    // validasi input teks (tidak boleh kosong)
    public static String inputTeks(Scanner input, String pesan) {
        String teks;
        while (true) {
            System.out.print(pesan);
            teks = input.nextLine().trim();
            if (!teks.isEmpty()) {
                break;
            }
            System.out.println("Input tidak boleh kosong. Coba lagi!");
        }
        return teks;
    }


    public static void tekanEnter(Scanner input) {
        System.out.println("\nTekan ENTER untuk lanjut...");
        input.nextLine();
    }
}
