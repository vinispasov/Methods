import java.util.Scanner;
public class NumbersFrom1ToN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		printNumbersFrom1ToN(n);
		
	}
	
	private static void printNumbersFrom1ToN(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(i+" ");
		}
	}
}
