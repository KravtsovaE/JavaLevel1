public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }

    public void eat(Plate plateForFood) {
        if (plateForFood.decreaseFood(appetite)) {
            wellFed = true;
        } else {
            wellFed = false;
        }
    }

    public void info() {
        System.out.println("[" + name + ", " + appetite + ", " + (wellFed ? "сытый" : "голодный") + "]");
    }
}
