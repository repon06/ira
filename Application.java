public class Application {
    public static void main(String[] args) {
        var cat1 = new Kotik(1, "cat 1", 3, "myau");
        var cat2 = new Kotik();

        cat2.setKotik("cat 2", 5, "meooo");

        cat1.liveAnotherDay();
        cat1.printCatInfo();
        cat1.printDiffMeow(cat2);

        Kotik.printCatsCount();//Kotik.getCount();
    }
}
