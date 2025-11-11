//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer = (args[0]).toUpperCase();
            int times  = Integer.parseInt(args[1]);
            String give = "Give me ";
            int letters = cheer.length();
            String options = "AEFHILMNORSX";
            String curr = "";
            for(int i = 0; i < letters; i++){
                curr = String.valueOf(cheer.charAt(i));
                if (options.indexOf(curr) != -1) {
                        System.out.println(give + "an " + curr + ": " + curr + "!");
                } else {
                        System.out.println(give + "a  " + curr + ": " + curr + "!");
                }
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < times; i++){
                System.out.println(cheer + "!!!");
            }
        }
}
