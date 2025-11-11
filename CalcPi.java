// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		Boolean isPlus = false;
		double deno = 3;
		double sum = 1.0;
		for(int i = 0; i < (num-1) ; i++ ) {
			if (isPlus) {
				sum += (double)(1.0/deno);
			} else {
				sum -= (double)(1.0/deno);
			}
			isPlus = !isPlus;
			deno += 2.0;
		} 
		double numP = Math.PI;
		System.out.println("pi according to Java: " + numP);
		System.out.println("pi, approximated:     " + (sum * 4.0));
	}
}
