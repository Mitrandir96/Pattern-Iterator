package ru.netology;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(3, 26)) {
            System.out.println("Случайное число: " + r);
            if (r == 26) {
                System.out.println("Выпало число 26, давайте на этом закончим");
                break;
            }
        }
    }
}