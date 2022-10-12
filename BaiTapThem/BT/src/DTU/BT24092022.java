package DTU;

import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    private String food;
    private String sex;
    private double weight;

    public Animal(String food, String sex, double weight) {
        this.food = food;
        this.sex = sex;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Food : ");
        this.food = scanner.nextLine();
        System.out.print("-Enter Weight : ");
        this.weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("-Enter Sex : ");
        this.sex = scanner.nextLine();
    }

    void output() {

    }

    @Override
    public String toString() {
        return "Food : " + this.food + " || Weight : " + this.weight + " || Sex : " + this.sex;
    }

    public int ageDog() {
        return 0;
    }
    public int ageCat(){
        return 0;
    }
}

class Cat extends Animal {
    private String name;
    private int age;

    public Cat(String food, String sex, double weight, String name, int age) {
        super(food, sex, weight);
        this.name = name;
        this.age = age;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Name : ");
        this.name = scanner.nextLine();
        System.out.print("-Enter Age : ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        super.input();
    }

    void output() {
        super.output();
    }

    @Override
    public String toString() {
        return " I am Cat \n\t- Name : " + this.name + " || Sex : " + this.getSex() +
                " || Age : " + this.age + " || Weight : " + this.getWeight() +
                " || Food : " + this.getFood();
    }

    public int ageCat() {
        return age;
    }
}

class Dog extends Animal {
    private String species;
    private int age;
    private String name;

    public Dog(String food, String sex, double weight, String species, int age, String name) {
        super(food, sex, weight);
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public Dog() {

    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Name : ");
        this.name = scanner.nextLine();
        System.out.print("-Enter Age : ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("-Enter Species : ");
        this.species = scanner.nextLine();
        super.input();
    }

    void output() {
        super.output();
    }

    @Override
    public String toString() {
        return "I am Dog \n\t- Name : " + this.name + " || Sex : " + this.getSex() + " || Species : " + this.species +
                " || Age : " + this.age + " || Weight : " + this.getWeight() +
                " || Food : " + this.getFood();
    }

    public int ageDog() {
        return age;
    }
}

public class BT24092022 {
    ArrayList<Animal> animals = new ArrayList<>();
    int n;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-Enter Number Animal : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Cat (C) or Dog (D) : ");
            String c = scanner.next();
            if (c.equals("C") || c.equals("c")) {
                Cat cat = new Cat();
                cat.input();
                animals.add(cat);
            }else if (c.equals("D") || c.equals("d")) {
                Dog dog = new Dog();
                dog.input();
                animals.add(dog);
            }
        }
    }

    void output() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("\t" + animals.get(i));
        }
    }

    void sortAgeDog() {
        System.out.println("\nSort Age By Dog");
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).ageDog() < animals.get(j).ageDog()) {
                    Animal tmp = animals.get(i);
                    animals.set(i, animals.get(j));
                    animals.set(j, tmp);
                }
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().equals(Dog.class)) {
                System.out.println("\t" + animals.get(i));
            }
        }
    }

    void sortAgeCat(){
        System.out.println("\nSort Age By Cat");
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).ageCat() < animals.get(j).ageCat()) {
                    Animal tmp = animals.get(i);
                    animals.set(i, animals.get(j));
                    animals.set(j, tmp);
                }
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().equals(Cat.class)) {
                System.out.println("\t" + animals.get(i));
            }
        }
    }

    public static void main(String[] args) {
        BT24092022 b = new BT24092022();
        b.input();
        b.output();
        b.sortAgeDog();
        b.sortAgeCat();
    }
}
