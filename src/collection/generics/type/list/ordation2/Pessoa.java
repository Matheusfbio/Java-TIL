package collection.generics.type.list.ordation2;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //atribuits
    private String name;

    private int age;

    private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public Pessoa(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    @Override
    public int compareTo(@NotNull Pessoa p) {
        return Integer.compare(age, p.getAge());
    }
}
 class ComparatorToHeight implements Comparator<Pessoa> {
     @Override
     public int compare(Pessoa p1, Pessoa p2) {
         return Double.compare(p1.getHeight(), p2.getHeight());
     }
 }