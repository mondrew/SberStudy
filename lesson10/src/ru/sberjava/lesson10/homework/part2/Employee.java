/*
 * QuadFunction testing
 * The 10th homework (part 2) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part2;

public class Employee {
    private String name;
    private String position;

    public Employee() {
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    double countYearBonus(Integer firstQ, Integer secondQ, Integer thirdQ, Integer fourthQ,
                       QuadFunction<Integer, Integer, Integer, Integer, Double> quadFunction) {
        double res = quadFunction.apply(firstQ, secondQ, thirdQ, firstQ);
        return (res);
    }
}
