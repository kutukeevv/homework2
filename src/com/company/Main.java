package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt();
        System.out.print("Сколько сейчас градусов на улице?: ");
        int temperature = sc.nextInt();
        if ((age > 20 && age < 45) && (temperature < -20 && temperature > 30)) {
            System.out.println("Не выходите на улицу!");
        } else if (age < 20 && (temperature > 0 && temperature < 28)) {
            System.out.println("Не выходите на улицу!");
        } else if (age > 45 && (temperature > -10 && temperature < 28)) {
            System.out.println("Не выходите на улицу!");
        }
            else
            System.out.println("Идите к другу");
        }

        }
