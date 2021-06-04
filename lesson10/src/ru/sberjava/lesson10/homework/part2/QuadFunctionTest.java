package ru.sberjava.lesson10.homework.part2;

public class QuadFunctionTest {
    public static void main(String[] args) {
        Employee accountant = new Employee("Joe", "accountant");
        Employee salesman = new Employee("Kevin", "salesman");
        Employee manager = new Employee("Fred", "manager");

        double accountantBonus = accountant.countYearBonus(100, 50, 20, 120,
                (a, b, c, d) -> a * 0.1 + b * 0.05 + c * 0.03 + d * 0.15);
        double salesmanBonus = salesman.countYearBonus(30, 50, 20, 40,
                (a, b, c, d) -> a * 0.5 + b * 0.03 + c * 0.3 + d * 0.01);
        double managerBonus = manager.countYearBonus(99, 192, 429, 448,
                (a, b, c, d) -> ((a + b + c + d) * 0.3));
        System.out.println(accountant.getName() + "'s year bonus is: " + accountantBonus);
        System.out.println(salesman.getName() + "'s year bonus is: " + salesmanBonus);
        System.out.println(manager.getName() + "'s year bonus is: " + managerBonus);
    }
}
