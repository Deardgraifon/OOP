package ru.mirea.Lab1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Lee", 3);
        Dog d2 = new Dog("Rolf", 6);
        Dog d3 = new Dog("Jake");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge(); }
}
