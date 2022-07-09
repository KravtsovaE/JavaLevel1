public class JavaLevel1 {
    public static void main(String[] args){
        Cat Basya = new Cat("Бася", "grey");
        Basya.swim(10);

        Cat Coca = new Cat("Кока", "color point");
        Coca.run(50);

        Cat Marsik = new Cat("Марсик", "color point");
        Marsik.run(300);

        Dog Jina = new Dog("Джина", "apricot");
        Jina.run(200);

        Dog Red = new Dog("Ред", "red");
        Red.run(500);

        Dog Ukki = new Dog("Юкки", "black");
        Ukki.swim(30);
    }
}
