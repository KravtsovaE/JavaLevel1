public class Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    public float salary;
    public int age;

    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Name:" + name + "," + "Position:" + position + "," + "email:" + email + "," + "Phone:" + phone + "," + "Salary:" + salary + "," + "Age:" + age);
    }
}
