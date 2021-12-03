
public class NomorTujuh {

	public static void main(String[] args) {
		TabunganTujuh simpedes = new TabunganTujuh("Tessy Wahyuni Riyawati Hartati", 89, 100000);
		simpedes.cekSaldo();
		simpedes.setor(8000);
		simpedes.cekSaldo();
		simpedes.tarik(230000);
		simpedes.tarik(60000);
		simpedes.cekSaldo();
		System.out.println();

		TabunganTujuh tabanas = new TabunganTujuh("Hindun", 90, 0);
		tabanas.cekSaldo();
		tabanas.tarik(10000);
		tabanas.tarik(1000);
		tabanas.setor(20000);
		tabanas.tarik(20000);

//		// TODO Auto-generated method stub
//		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
//		System.out.println("Setoran sebesar "+simpedes.setor(8000)+" berhasil dilakukan, saldo anda sekarang "+simpedes.cekSaldo());
//		System.out.println("Saldo anda saat ini adalah "+simpedes.cekSaldo());
////		System.out.println("Saldo anda saat ini adalah "+simpedes.tarik(230000));
////		System.out.println("Saldo anda saat ini adalah "+simpedes.tarik(60000));
////		System.out.println("Saldo anda saat ini adalah "+simpedes.cekSaldo());
//		
//		
//		
//		
//		
////		System.out.println();
////		
////		Tabungan tabanas = new Tabungan ("Hindun",90);
////		tabanas.cekSaldo();
////		tabanas.tarik(10000);
////		tabanas.tarik(1000);
////		tabanas.setor(20000);
////		tabanas.tarik(20000);
//		System.out.println("anehh");

	}

}



//class Tabungan{
//	private String nama;
//	private int norek,saldo;
//	public Tabungan(String nama, int norek) {
//		super();
//		this.nama = nama;
//		this.norek = norek;
//	}
//	public Tabungan(String nama, int norek, int saldo) {
//		super();
//		this.nama = nama;
//		this.norek = norek;
//		this.saldo = saldo;
//	}
//	public int cekSaldo() {
//		// TODO Auto-generated method stub
//		return this.saldo;
//		
//	}
//	public int tarik(int tarik) {
//		return tarik;
//		
//		
//	}
//	public int setor(int setor) {
//		return setor;
//		
//		
//	}
//}
