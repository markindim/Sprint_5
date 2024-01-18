package ru.yandex.praktikum;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> farmAnimals = new ArrayList<>();
        farmAnimals.add("DoG Бобик");
        farmAnimals.add("сat Васька");
        farmAnimals.add("COW Буренка");
        farmAnimals.add("dog Шарик");
        farmAnimals.add("cAt Рыжик");
        farmAnimals.add("sheep Долли");
        farmAnimals.add("cow");
        farmAnimals.add("Жучка");
        farmAnimals.add("not_defined Коровушка");
        farmAnimals.add("cat l");

        AnimalFarm animalFarm = new AnimalFarm(farmAnimals);

        HashSet<String> uniqueNames = animalFarm.uniqueNames();
        System.out.println("Имена животных на ферме: " + uniqueNames);

        System.out.println("Список животных на ферме:");
        for (int i = 0; i < farmAnimals.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, farmAnimals.get(i) + ";");
        }
    }
}