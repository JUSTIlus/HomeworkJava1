public class SecondTask {
    public static void main(String[] args) {
        int x = 345;
        int a = x;
        int x3 = x % 10;
        x = x / 10;
        int x2 = x % 10;
        x = x / 10;
        int x1 = x % 10;
        System.out.println("Число " + a + " ->" + x1 + "," + x2 + "," + x3 + ".");
    }
}
