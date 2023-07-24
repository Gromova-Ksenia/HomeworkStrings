public class Task7 {
    public static void main(String[] args) {
        System.out.print(isLucky(123421));
    }

    static boolean isLucky(int num) {
        boolean lucky = false;
        int firstHalf = num / 1000;
        int secondHalf = num % 1000;
        if (sumOfTree(firstHalf) == sumOfTree(secondHalf)) lucky = true;
        return lucky;
    }

    static int sumOfTree(int num) {
        int sum = 0;
        num /= 1000;
        sum = num % 10 + (num / 10) % 10 + num / 100;
        return sum;
    }
}
