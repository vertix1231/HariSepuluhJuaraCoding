
public class Smk extends Sekolah {
	String nama,alamat,jenjang;

	public Smk(String nama, String alamat, String jenjang) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenjang = jenjang;
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJenjang() {
		return jenjang;
	}

	public void setJenjang(String jenjang) {
		this.jenjang = jenjang;
	}

	

}
