package org.hw1;

import org.hw1.module.Kotik;

public class Application {
    public static void main(String[] args) {
        var cat1 = new Kotik(1, "cat 1", 3, "myau");
        var cat2 = new Kotik();

        cat2.setKotik(3, "cat 2", 5, "meooo");

        cat1.liveAnotherDay();
        cat2.liveAnotherDay();

        cat1.printCatInfo();
        cat1.printDiffMeow(cat2);

        Kotik.printCatsCount();
    }
}
