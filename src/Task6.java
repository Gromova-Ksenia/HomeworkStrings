public class Task6 {
    public static void main(String[] args) {
        System.out.print(isSimple(283));
    }

    static boolean isSimple(int num) {
        boolean simple = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                simple = false;
                break;
            }
        }
        return simple;
    }
}
