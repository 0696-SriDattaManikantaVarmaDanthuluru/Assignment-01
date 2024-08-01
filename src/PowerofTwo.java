public class PowerofTwo {

        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Usage: java PowersOfTwo <N>");
                return;
            }

            try {
                int N = Integer.parseInt(args[0]);

                if (N < 0 || N >= 31) {
                    System.out.println("N must be between 0 and 30 inclusive.");
                    return;
                }
                for (int i = 0; i <= N; i++) {
                    System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer for N.");
            }
        }

}
