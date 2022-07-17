public class App {
    public static void main(String[] args) {
        
        Plate plate1 = new Plate(350);
        
        Cat cat1 = new Cat("Бася", 200);
        Cat cat2 = new Cat("Кока", 100);
        Cat cat3 = new Cat("Марсик", 100);

        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            cats[i].info();
        }

        plate1.info();
        plate1.fillFood(50);
        plate1.info();
    }
}
