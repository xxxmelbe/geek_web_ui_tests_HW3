package ru.geekbrains.lesson4;

import java.util.Scanner;

public class HomeWork4_TriangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение стороны а: ");
        int a = scanner.nextInt();

        System.out.println("Введите значение стороны b: ");
        int b = scanner.nextInt();

        System.out.println("Введите значение стороны с: ");
        int c = scanner.nextInt();

        int p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника равна = " + s);
    }
}
