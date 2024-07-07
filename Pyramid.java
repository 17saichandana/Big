public class Pyramid {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of levels for the pyramid.");
            return;
        }
        
        int levels = Integer.parseInt(args[0]);
        for (int i = 1; i <= levels; i++) {
            for (int j = levels; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
