
public class TabunganDelapan {
	private String nama;
	private int nomorTabungan;
	private int saldo;
	
	public TabunganDelapan(String nama, int nomorTabungan, int saldo) {
		
		this.nama = nama;
		this.nomorTabungan = nomorTabungan;
		this.saldo = saldo;	
	}
	
	public String toString() {
	      return "Tabungan nomor "+ nomorTabungan + " atas nama "+ nama +" dengan saldo sebesar "+saldo;
	}
}
