public class Dog extends Animal {
    protected String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }
    public void run(int meters) {
        if (meters > 500) {
            System.out.println(this.name + " - собака, значит не может бегать так далеко.");
        } else {
            super.run(meters);
        }
    }
    public void swim(int meters) {
        if (meters > 10) {
            System.out.println(this.name + " - собака, значит не может плавать так далеко.");
        } else {
            super.swim(meters);
        }
    }
}
