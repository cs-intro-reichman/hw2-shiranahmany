// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		String steps = "";
		int curr = 0;
		int count = 0;

		for(int i = 1; i <= seed; i++){
			curr = i;
			do {
				steps += curr + " ";
				count++;
				if (curr%2 == 0) {
					curr = curr/2;
				} else {
					curr = (curr * 3) + 1;
				}
			} while(curr != 1);

			steps += "1 (" + count + ")";

			if("v".equals(mode)){
				System.out.println(steps);
			}
			steps = "";
			count = 0;
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	
	}
}
