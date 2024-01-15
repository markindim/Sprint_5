package ru.yandex.praktikum;

import java.util.*;

public class AnimalFarm {
    private ArrayList<String> farmAnimals;

    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

//  В классе AnimalFarm реализуй метод countedAnimals. Он должен по полю farmAnimals формировать хеш-таблицу, в которой ключ — это вид животного (Animal), а значение — количество животных этого вида на ферме.
//  Если какая-то строка в списке не содержит первым словом валидный вид животного, метод должен вывести в консоль фразу: Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.
//  Метод возвращает сформированную хеш-таблицу.
    public HashMap<Animal, Integer> countedAnimals() {
        HashMap<Animal, Integer> animalMap = new HashMap<>();

        for (String farmAnimal : farmAnimals) {
            Animal animal;
            try {
                animal = Animal.valueOf(farmAnimal.split(" ")[0].toUpperCase());
                Integer countOfAnimals = animalMap.get(animal);
                animalMap.put(animal, countOfAnimals == null ? 1 : countOfAnimals + 1);
            } catch (Exception exception) {
                System.out.printf("Please correct string: %s. Incorrect input data. %n", farmAnimal);
            }
        }
        return animalMap;
    }

//  В классе AnimalFarm реализуй метод uniqueNames. Он должен возвращать коллекцию всех уникальных имён животных на ферме. Подходящий тип коллекции подбери самостоятельно.
//  Если в какой-то строке списка нет второго слова, метод должен вывести в консоль фразу: Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.
    public HashSet<String> uniqueNames() {
        HashSet<String> uniqueNames = new HashSet<>();

        for (String farmAnimal : farmAnimals) {
            String name;
            try {
                name = farmAnimal.split(" ")[1];
                uniqueNames.add(name);
            } catch (Exception exception) {
                System.out.printf("Please correct string: %s. Incorrect input data. %n", farmAnimal);
            }
        }
        return uniqueNames;
    }

//    В классе AnimalFarm реализуй три метода для разных вариантов добавления нового животного на ферму:
//    по переданному виду животного и имени;
//    по переданному виду животного. В этом случае имя животного равно N;
//    по переданному имени животного. В этом случае вид животного равен NOT_DEFINED.
    public void addFarmAnimals(Animal animal, String name) {
        farmAnimals.add(animal.name() + " " + name);
    }

    public void addFarmAnimals(Animal animal) {
        farmAnimals.add(animal.name() + " N");
    }

    public void addFarmAnimals(String name) {
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

//    В классе AnimalFarm переопредели метод toString так, чтобы он выводил информацию по животным на ферме в виде:
//    Вид_животного Имя_животного
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            String printFarmAnimal = farmAnimal.replace(" ", ": ");
            sb.append(printFarmAnimal).append("/n");
        }
        return sb.toString();
    }
}