import java.util.Scanner;

public class NomorSembilan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input  ");
		double arraydata[] = sc.next();

		jumlahArray(arraydata)
	}

	public static int jumlahArray(int[] nilai) {
		int sum = 0;
		for (int i = 0; i < nilai.length; i++) {
			sum += nilai[i];
		}
		return sum;
	}

	public static boolean cariNilai(int[] arr, int nilai) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == nilai)
				return true;
		}
		return false;
	}

}
