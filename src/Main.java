package com.max.idea;

/*Напишите программу конвертер физических величин:

        1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        > Выберите что переводить: 1 - масса, 2 - расстояние
        > 2

        2. Пользователю предлагается выбрать единицу измерения. Пример:
        > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
        > 1

        3. Пользователю предлагается ввести количество выбранных единиц:
        > Введите число
        > 10
        > Результат:
        > Метры: 10
        > Мили: 0.006
        > Ярды: 10.94
        > Футы: 32.81*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        byte option = in.nextByte(); //выбираем физическую величину

        switch (option){
            //если измерям массу - 1
            case 1:
                System.out.println("Выберите единицу измерения: 1 - Килограммы, 2 - Граммы");
                byte weight = in.nextByte();

                System.out.println("Введите значение: ");
                double num = in.nextDouble();
                double g = num * 1000; //перевод граммов в кг
                double kg = num/1000; //перевод кг в граммы

                if (weight==1)
                    System.out.printf("Результат:%n Килограммы: %f%n Граммы: %f",num,g);
                else
                    System.out.printf("Результат:%n Килограммы: %f%n Граммы: %f",kg,num);
                break;

            //если измеряем расстояние - 2
            case 2:
                System.out.println("Выберите единицу измерения: 1 - Километры, 2 - Метры");
                byte distance = in.nextByte();

                System.out.println("Введите значение: ");
                double nums = in.nextDouble();

                //в зависимости от единицы расчитываем вывод ответа
                switch (distance){
                    case 1:
                        double m = nums * 1000; //перевод км в метры
                        System.out.printf("Результат:%n Километры: %f%n Метры: %f",nums,m);
                        break;
                    case 2:
                        double km = nums/1000; //перевод метров в км
                        System.out.printf("Результат:%n Километры: %f%n Метры: %f",km,nums);
                        break;
                }
            break;
        }

    }
}
