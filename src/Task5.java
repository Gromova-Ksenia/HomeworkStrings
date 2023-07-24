public class Task5 {
    public static void main(String[] args) {
        System.out.print(sum(10, 20));
    }

    static int sum(int a, int b) {
        int summa = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i < b; i++) summa += i;
        return summa;
    }
}
