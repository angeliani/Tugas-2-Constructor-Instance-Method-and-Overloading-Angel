public class Main {
    public static void main(String[] args) {
        // Membuat dua objek dengan constructor berbeda
        BankAccount akun1 = new BankAccount("12345", "Lucinta Luna", 1000.0, "Tabungan");
        BankAccount akun2 = new BankAccount("67890", "Byeon Woo Seok", "Giro");

        // Menampilkan informasi awal
        akun1.displayInfo();
        akun2.displayInfo();

        // Melakukan transaksi
        akun1.deposit(500);
        akun1.withdraw(300);
        akun1.transfer(akun2, 200);

        // Menampilkan informasi setelah transaksi
        akun1.displayInfo();
        akun2.displayInfo();
    }
}
