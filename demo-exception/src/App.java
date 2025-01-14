public class App {
    public static void main(String[] args) {
        int q = 0;
        //int x = 10 / q;
        if (q != 0) {
            int x = 10 / q;
        }
        else {
            System.out.println("Q cannot be zero");
        }

        try {
            concat(null, "abc");
        } catch (IllegalArgumentException e) {
            System.out.println("Ignore the exception.");
        }

    }

    public static String concat(String x, String y) {
        if (x == null)
            throw new IllegalArgumentException();

        return x.concat(y);
    }
}
