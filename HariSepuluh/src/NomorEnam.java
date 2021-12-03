import java.util.Scanner;

class BebasException extends Exception {
	public BebasException(String s) {
		super(s);
	}
}
public class NomorEnam {
	
	static int gender,menikah = 1;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Ujian, gunakan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10%
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7%
		//wanita menikah, pajak 3%
		//validasi: jika diinputkan selain 2 jenis kelamin
		//tersebut gunakan throw
		//validasi: jika diinputkan selain 2 status tersebut
		//gunakan catch
		System.out.println("(NOTE: 1== LAKI,MENIKAH) (0==PEREMPAUN,BELUM NIKAH)!!! ");
		Scanner sc = new Scanner(System.in);
		System.out.print("masukan status gender : ");
		gender = sc.nextInt();
		System.out.print("masukan status menikah : ");
		menikah = sc.nextInt();
		
//		cobaClassAja();
//		System.out.println(tambahTestAjaClass());
//		dummy();
		
		try {
			switch (gender) {
			case 1:
				switch (menikah) {
				case 1:
					System.out.println("pria menikah, pajak 5%");
					break;
				

				case 0:
					System.out.println("pria belum menikah, pajak 10%");
					break;
					
				}
				break;
			case 0:
				switch (menikah) {
				case 1:
					System.out.println("wanita menikah, pajak 3%");
					break;
				case 0:
					System.out.println("wanita belum menikah, pajak 7%");
					break;
				}
				break;
			default:
				throw new BebasException("Throw Custom Message Error");
				
			}
			
			
		} catch (BebasException bebas) {
			// TODO: handle exception
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());
		}
		
		
		
		
		
		
//		try {
//			throw new BebasException("Throw Custom Message Error");
//		} catch (BebasException bebas) {
//		// TODO: handle exception
//		System.out.println("Bebas Exception");
//		System.out.println(bebas.getMessage());
//		}

	}

}
