public class Task2 {
    public static void main(String[] args) {
        showEvens(3,24);
    }

    static void showEvens(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % 2 == 1) a++;
        for (int i = a; i < b; i += 2) {
            System.out.print(i + " ");
        }
    }
}
