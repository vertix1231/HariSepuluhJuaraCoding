import java.util.Scanner;

public class NomorSatu {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);

	}

	static void cetakFibonacci(int batas) {
		// TODO Auto-generated method stub
		int ketentuan1 = 1;
		int ketentuan2 = 1;
//		int[] initDeret = {1,1};
//		for(int i=2;i<batas;i++) {
//			
//		}
		while (ketentuan1 <= batas) {
		      System.out.print(ketentuan1 + " ");

		      int nextTerm = ketentuan1 + ketentuan2;
		      ketentuan1 = ketentuan2;
		      ketentuan2 = nextTerm;

		   
		}
		
	}

}
