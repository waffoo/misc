public class Main {
    public static void main (String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        p = new PrintBanner2("Hello2");
        p.printWeak();
        p.printStrong();
    }

}