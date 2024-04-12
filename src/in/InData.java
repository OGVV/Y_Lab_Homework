package in;

import java.util.Scanner;

public class InData {

    /*public Trainings createNewTraining() {
        Scanner scanner = new Scanner(System.in);
        Trainings newTraining = new Trainings();
        System.out.println("Введите значение");
        newTraining.setTraining_id(scanner.nextInt());

        newTraining.setName_training(scanner.nextLine());

        System.out.println("Введите значение");
        newTraining.setTraining_type_id(scanner.nextInt());

        newTraining.setAdditional_option(scanner.nextLine());

        newTraining.setDate_training(getVerifyString());

        newTraining.setCount_spent_calories(scanner.nextInt());

        newTraining.setTime_training(scanner.nextLine());
        return newTraining;
    }*/

    public int getVerifyIntValue(int defaultValue) {
        Scanner scanner = new Scanner(System.in);
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            number = defaultValue;
            scanner.next();
        }
        return number;
    }

    public String getVerifyString() {
        Scanner scanner = new Scanner(System.in);
        String string;
        if (scanner.hasNextLine()) {
            string = scanner.nextLine();
        } else {
            string = "";
            scanner.next();
        }
        return string;
    }

    public Long getVerifyDate() {
        Scanner scanner = new Scanner(System.in);
        Long date;
        if (scanner.hasNextLong()) {
            date = scanner.nextLong();
        } else {
            date = 0L;
            scanner.next();
        }
        return date;
    }

}
