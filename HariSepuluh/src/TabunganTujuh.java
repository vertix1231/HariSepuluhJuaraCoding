public class TabunganTujuh {
	private String nama;
	private int nomorTabungan;
	private int saldo;

	public TabunganTujuh(String nama, int nomorTabungan, int saldo) {

		this.nama = nama;
		this.nomorTabungan = nomorTabungan;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setor(int newSaldo) {
		saldo = this.saldo + newSaldo;
		System.out.println("Setoran sebesar " + newSaldo + " berhasil dilakukan, saldo anda sekarang " + saldo);
	}

	public void cekSaldo() {
		System.out.println("Saldo anda saat ini adalah " + getSaldo());
	}

	public void tarik(int tarikSaldo) {
		if (tarikSaldo <= saldo) {
			saldo = this.saldo - tarikSaldo;
			System.out.println("Penarikan sebesar " + tarikSaldo + " berhasil dilakukan, saldo anda sekarang " + saldo);
		} else {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo tidak mencukupi");
		}
	}

}