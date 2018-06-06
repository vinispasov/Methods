import java.util.Scanner;
import java.util.ArrayList;
public class PrimesToN {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		ArrayList<Integer>primes=findPrimesToN(n);
		for (int i = 0; i < primes.size(); i++) {
		   System.out.print(primes.get(i)+" ");
		}
	}
	
	private static ArrayList<Integer>findPrimesToN(int n) {
		ArrayList<Integer>primes=new ArrayList();
		boolean isPrime=true;
		int maxDivider;
		int divider=2;
		for (int i =1; i <=n; i++) {
			
			maxDivider=(int)Math.sqrt(i);
			
			while (isPrime&&(divider<=maxDivider)) {
				if (i%divider==0) {
					isPrime=false;
				}
				
				divider++;
				
				
			}
			if (isPrime) {
				primes.add(i);
			}
		}
		
			
		
		return primes;
	}

}
