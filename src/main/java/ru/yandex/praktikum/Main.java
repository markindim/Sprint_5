package ru.yandex.praktikum;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> farmAnimals = new ArrayList<>();
        farmAnimals.add("DoG: Бобик");
        farmAnimals.add("сat: Васька");
        farmAnimals.add("COW: Буренка");
        farmAnimals.add("dog: Шарик");
        farmAnimals.add("cAt: Рыжик");
        farmAnimals.add("sheep: Долли");
        farmAnimals.add("cow: ");

        AnimalFarm animalFarm = new AnimalFarm(farmAnimals);

        HashSet<String> uniqueNames = animalFarm.uniqueNames();
        System.out.println("Unique animal names: " + uniqueNames);
    }
}