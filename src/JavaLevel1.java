public class JavaLevel1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 300000, 30);
        employees[1] = new Employee("Olegov Oleg", "Senior Engineer", "oo@mail.com", "891111111", 600000, 33);
        employees[2] = new Employee("Petrov Petr", "Junior Engineer", "pp@mail.com", "892222222", 250000, 40);
        employees[3] = new Employee("Katina Katya", "Junior QA Engineer", "kk@mail.com", "893333333", 150000, 41);
        employees[4] = new Employee("Lenina Lena", "Senior QA Engineer", "ll@mail.com", "894444444", 300000, 43);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].info();
            }
        }
    }
}
