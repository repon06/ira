public class Kotik {
    private int age; // возраст
    private String name; //имя котика вывести на экран
    private int weight; //вес котика нужно вывести на экран
    private String meow; //организовать сравнение голосов разных котиков
    private int satiety; //показывает сытость котика, если = 0, то Котик не выполняет ни один метод, он только хочет есть public boolean eat ().
    private String food; // названия еды для метода eat()
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

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public static int getCount() {
        return count;
    }

/*    public static void setCount(int count) {
        Kotik.count = count;
    }*/


    //public static void Application(){	}

    public Kotik() {
        count++;
    }

    public Kotik(int age, String name, int weight, String meow) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        count++;
    }

    public void setKotik(String name, int weight, String meow) {
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            if (this.satiety <= 0) { //есть в самом методе eat
                eat(3, "sausages");
            } else {
                int action = (int) (Math.random() * 4 + 1);
                switch (action) {
                    case 1:
                        play();
                    case 2:
                        sleep();
                    case 3:
                        chaseMouse();
                    case 4:
                        walk();
                    default:
                        eat();
                }
            }
        }
    }


    public boolean play() { // true или false, если Котик выполняет, то сытость уменьшается
        this.satiety--;
        return true;
    }

    public boolean sleep() { // true или false
        System.out.println("The cat is sleeping.");
        return true;
    }

    public boolean chaseMouse() { //true или false
        System.out.println("The cat chase mouse.");
        this.satiety--;
        return true;
    }

    public boolean walk() {  // true или false
        System.out.println("The cat took a walk.");
        this.satiety--;
        return true;
    }

    public boolean eat() { // если сытость = 0, выполняется.
        if (this.satiety <= 0)
            return eat(1, "milk"); //todo: satiety ???
        else
            return false;
    }

    // будет принимать только количество условных единиц сытости и увеличивать на них соответствующую переменную экземпляра
    public boolean eat(int satiety) {
        System.out.println("Cat ate.");
        this.satiety += satiety;
        return true;

    }

    //будет принимать единицы сытости и название еды
    public boolean eat(int satiety, String food) {
        System.out.println(String.format("Cat ate %s.", food));
        this.satiety += satiety;
        this.food = food;
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
