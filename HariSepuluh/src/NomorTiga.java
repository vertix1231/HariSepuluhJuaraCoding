import java.util.Scanner;

public class NomorTiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input jarak(km): ");
		double jarak = sc.nextInt();
		System.out.print("Input watu(jam): ");
		double waktu = sc.nextInt();
		
		System.out.println("Kecepatan rata-rata anda adalah "+hitungKecepatan(jarak, waktu)+" km/jam");
		

	}
	
	static double hitungKecepatan(double jarak,double waktu) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
		return jarak/waktu;
		}


}
