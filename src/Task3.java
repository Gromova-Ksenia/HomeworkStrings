public class Task3 {
    public static void main(String[] args) {
        drawLine(true, 10, '#');
    }

    static void drawLine(boolean vertical, int length, char c) {
        for (int i = 0; i < length; i++) {
            if (vertical) System.out.print(c + "\n");
            else System.out.print(c);
        }
    }
}
