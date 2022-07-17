public class Plate {
    private  int food;

    public Plate(int food) {
        this.food = food;
    }

    public void fillFood(int newFood) {
        food += newFood;
    }

    public boolean decreaseFood(int appetite) {
        if (this.food >= appetite) {
            this.food -= appetite;
            return true;
        } else {
            System.out.println("Кошке не хватает еды в этой тарелке");
            return false;
        }
    }

    public void info() {
        System.out.println("[" + food + "]");
    }
}
