public class Cat extends Animal {
    protected String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void run(int meters) {
        if (meters > 200) {
            System.out.println(this.name + " - кот, значит не может бегать так далеко.");
        } else {
            super.run(meters);
        }
    }

    public void swim(int meters) {
        System.out.println(this.name + " - кот, а значит не умеет плавать.");
    }
}
