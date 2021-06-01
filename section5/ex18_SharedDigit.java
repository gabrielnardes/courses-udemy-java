package section5;

public class ex18_SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        } else {
            return (a % 10 == b % 10) ||
                   (a % 10 == b / 10) ||
                   (a / 10 == b % 10) ||
                   (a / 10 == b / 10);
        }
    }
}