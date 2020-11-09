package ru.lesson1;

    import java.util.Scanner;

    class Main {
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int action;
            Cat[] allCats = new Cat[4];
            allCats[0] = new Cat("Вискас", 20, false);
            allCats[1] = new Cat("Злодей", 40, false);
            allCats[2] = new Cat("Интеграл", 10, false);
            allCats[3] = new Cat("Пупс", 40, false);


            Plate plate = new Plate(50);
            plate.info();
            for (int i = 0; i < allCats.length; i++) {
                if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                    allCats[i].eat(plate);
                    allCats[i].fullness = true;
                    System.out.println("Котик " + allCats[i].name + " покушал!");
                } else {
                    System.out.println("Котик " + allCats[i].name + " не поел!");
                }
            }
            plate.info();
            System.out.println("Какое количество еды вы еще хотите добавить?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();

        }
    }

