import java.util.Scanner;

public class NomorEmpat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan sisa BBM dalam tangki (liter) = ");
		double jarak = sc.nextInt();
		System.out.print("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		double waktu = sc.nextInt();
		double sisaBbm = hitungSisaJarak(waktu, jarak);
		
		System.out.println("output:\rKendaraan anda dapat menempuh jarak "+ sisaBbm+
				" kilometer dengan sisa "
				+ "BBM yang ada di tangki");
	}
	
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		}

}
