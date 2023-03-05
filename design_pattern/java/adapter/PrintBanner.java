public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        // inherited from Banner
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }
    @Override
    public void printStrong() {
        showWithAster();
    }
}