package ru.mirea.Lab3;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Преступление и наказание", "Ф.М.Достоевский", 331, 450);
        Book d2 = new Book("Три товарища", "Э.М.Ремарк", 470, 335);
        Book d3 = new Book("Приключения Шерлока Холмса", "А.К.Дойл6", 710, 800);
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();
    }
}
