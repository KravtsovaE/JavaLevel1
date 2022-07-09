public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int meters) {
        System.out.println(this.name + " пробежал " + meters + "м.");
    }

    public void swim(int meters) {
        System.out.println(this.name + " проплыл " + meters + "м.");
    }
}
