package org.hw1.module;

import java.util.List;
import java.util.Random;

public class Kotik {
    private int age; // возраст
    private String name; //имя котика вывести на экран
    private int weight; //вес котика нужно вывести на экран
    private String meow; //организовать сравнение голосов разных котиков
    private int satiety; //показывает сытость котика, если = 0, то Котик не выполняет ни один метод, он только хочет есть public boolean eat ().
    static int count;  // статическая переменная отвечает за количество созданных экземпляров класса Котик. При создании применять инкремент i++

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count;
    }

    public Kotik() {
        count++;
    }

    public Kotik(int age, String name, int weight, String meow) {
        setKotik(age, name, weight, meow);
        count++;
    }

    public void setKotik(int age, String name, int weight, String meow) {
        setAge(age);
        setName(name);
        setWeight(weight);
        setMeow(meow);
        setSatiety(0); //default
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            switch ((int) (Math.random() * 4 + 1)) { //new Random().nextInt(4) + 1
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    walk();
                    break;
                default:
                    eat();
                    break;
            }
        }
    }

    private boolean isHungry() {
        return this.satiety <= 0;
    }

    public boolean play() { // true или false, если Котик выполняет, то сытость уменьшается
        System.out.println(getName() + " is playing.");
        if (!isHungry()) {
            this.satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean sleep() { // true или false
        System.out.println(getName() + " is sleeping.");
        if (!isHungry()) {
            this.satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean chaseMouse() { //true или false
        System.out.println(getName() + " chase mouse.");
        if (!isHungry()) {
            this.satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean walk() {
        System.out.println(getName() + " took a walk.");
        if (!isHungry()) {
            this.satiety--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean eat() { // если сытость = 0, выполняется.
        return eat(new Random().nextInt(3) + 1, List.of("milk", "sausages", "meat").get(new Random().nextInt(3)));
    }

    // будет принимать только количество условных единиц сытости и увеличивать на них соответствующую переменную экземпляра
    public boolean eat(int satiety) {
        System.out.println("Cat ate.");
        this.satiety += satiety;
        return true;
    }

    //будет принимать единицы сытости и название еды
    public boolean eat(int satiety, String food) {
        System.out.println(String.format("Cat ate %s %s.", satiety, food));
        this.satiety += satiety;
        return true;
    }

/*    public boolean eat() {
        return eat(this.satiety, this.food); //todo: ???
    }*/

    public void printCatInfo() {
        System.out.println(String.format("Cat name: %s, cat weight: %s.", this.name, this.weight));
    }

    public void printDiffMeow(Kotik cat) {
        System.out.println(String.format("Cats meow %s.", isDiffMeow(cat) ? "the same way" : "in different ways"));
    }

    public boolean isDiffMeow(Kotik cat) {
        return this.meow.equals(cat.meow);
    }

    public static void printCatsCount() {
        System.out.println(String.format("Cats count: %s.", count));
    }
}
