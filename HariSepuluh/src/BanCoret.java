import java.util.Scanner;
class Nasabah{
    String Nama;
    String Alamat;
    int noKTP;
    int jumlahtab;
    double totaluang;
 
    tabungan tab []; //array untuk menyimpan banyak objek tabungan
   
Nasabah (int n, String N) {
        noKTP = n;
        Nama = N;
        System.out.println("Nasabah "+Nama+" berhasil dibuat" );
        tab = new tabungan[5];
    }
    void buatTabungan(tabungan x){
        tab[jumlahtab]=x;
        System.out.println("Tabungan baru sukses ditambahkan");
        jumlahtab++;
    }
    void cetak(){
       
        System.out.println("Jumlah Tabungan tuan "+Nama+" adalah "+ jumlahtab);
        System.out.println("Daftar Rekening");
        for (int i = 0;i<jumlahtab;i++){
            //System.out.println((i+1)+"\t"+tab[i].norek+"\t"+tab[i].saldo);
            System.out.print((i+1)+". ");
            tab[i].cetakSaldo();
            totaluang = totaluang + tab[i].saldo;
        }
        System.out.println("total uang = "+ totaluang );
    }
}

class tabungan {
    int norek;
    double saldo;
    tabungan (int nr, double s){
        norek = nr;
        saldo = s;
        System.out.println("Rekening "+norek+" berhasil dibuat");
    }
    void setor (double uang) {
        saldo = saldo+uang;
        System.out.println("setor sukses");
       
    }
    void tarik (double uang){
        if (saldo > uang){
        saldo = saldo-uang;
        System.out.println("tarik sukses");
        }
        else System.out.println("Tarik Gagal");
    }
    void transfer(int norek , double uang){
    if (saldo > uang) {  
    saldo=saldo-uang;
    System.out.println(" transfer "+ uang + " ke rekening " +norek+" sukses");
    }
    else System.out.println("transfer gagal");
    }
    void cetakSaldo (){
        System.out.println("Nomer Rekening "+norek+" Jumlah Saldonya "+saldo);
}
}
public class BanCoret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //untuk membuat input data dari user
		Scanner s = new Scanner(System.in);
        int ktp;
        String nama;
        System.out.print("Masukkan nomor KTP: ");
        ktp = s.nextInt();
        System.out.print("Masukkan nama: ");
        nama = s.next();
        Nasabah n = new Nasabah(ktp, nama);     //masukkan input sbg parameter
       
        tabungan t1 = new tabungan (12536, 70000);
        tabungan t2 = new tabungan (63784, 90000);
        tabungan t3 = new tabungan (9409, 80000);
        t3.cetakSaldo();
        t3.setor(1000000);
        t3.cetakSaldo();
        t3.tarik(5000000);
        t3.cetakSaldo();
        t3.transfer(1234, 10000000);
        t3.cetakSaldo();
        n.buatTabungan(t1);
        n.buatTabungan(t2);
        n.buatTabungan(t3);
        n.cetak();
        n.tab[1].cetakSaldo();
        n.tab[2].setor(1000000);
        n.tab[2].cetakSaldo();
        n.cetak();
    }
}