package ru.yandex.praktikum;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> farmAnimals = new ArrayList<>();
        farmAnimals.add("Dog: Bob");
        farmAnimals.add("Cat: Whiskers");
        farmAnimals.add("Cow: Bessie");
        farmAnimals.add("Dog: Max");
        farmAnimals.add("Sheep: Dolly");

        AnimalFarm animalFarm = new AnimalFarm(farmAnimals);

        HashSet<String> uniqueNames = animalFarm.uniqueNames();
        System.out.println("Unique animal names: " + uniqueNames);
    }
}