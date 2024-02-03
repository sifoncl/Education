package Exeption

import static java.lang.Integer.parseInt;

public class Division {

    public static Double divide(String... arguments) {

        int args[] = new int[arguments.length];

        for (int i = 0; i <= arguments.length - 1; i++) {
            try {
                args[i] = parseInt(arguments[i]);
            } catch (NumberFormatException e) {
                System.out.println("Символ(ы): " + arguments[i] + " не являются числом");
                System.exit(0);
            }
        }
        if (args[0] == 0) {
            return (double) 0;
        }

        double ans = (double) args[0];

        for (int i = 1; i <= args.length - 1; i++) {
            ans /= args[i];
            System.out.println(ans);
        }
        return ans;
    }
}