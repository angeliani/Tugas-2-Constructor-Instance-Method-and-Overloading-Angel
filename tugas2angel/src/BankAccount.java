public class BankAccount {
    String noRek;
    String namaPemilik;
    double saldo;
    String jenisAkun;

    // Constructor dgn 4 parameter
    BankAccount(String noRek, String namaPemilik, double saldo, String jenisAkun) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.jenisAkun = jenisAkun;
    }

    // Constructor dgn 3 parameter 
    BankAccount(String noRek, String namaPemilik, String jenisAkun) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.jenisAkun = jenisAkun;
        this.saldo = jenisAkun.equals("Tabungan") ? 100.0 : 500.0;
    }

    // Method utk informasi akun
    void displayInfo() {
        System.out.println("Nomor Rekening: " + noRek);
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Saldo         : " + saldo);
        System.out.println("Jenis Akun    : " + jenisAkun);
        System.out.println("---------------------------");
    }

    // Method utk deposit
    void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Berhasil deposit: " + nominal);
        }
    }

    // Method utk withdraw
    void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (saldo < nominal) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("Berhasil menarik: " + nominal);
        }
    }

    // Method utk transfer
    void transfer(BankAccount tujuan, double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal transfer harus lebih dari 0!");
        } else if (saldo < nominal) {
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        } else {
            saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Transfer berhasil sebesar " + nominal + " ke " + tujuan.namaPemilik);
        }
    }
}
