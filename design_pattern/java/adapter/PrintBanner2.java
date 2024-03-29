public class PrintBanner2 implements Print {
    private Banner banner;
    public PrintBanner2(String string) {
        // delegated to Banner
        this.banner = new Banner(string);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}