package ru.mirea.Lab2;

public class TestBall {public static void main(String[] args) {
    Ball b1 = new Ball(100, 100);
    Ball b2 = new Ball(104, 5);
    Ball b3 = new Ball(205, 160);
    Ball b4 = new Ball(555, 444);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    b1.move(30,15);
    b2.move(54,50);
    b3.move(91,90);
    b4.move(51,70);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
}
}
