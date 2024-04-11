package in;

import model.Trainings;

import java.util.Scanner;

public class InData {

    public Trainings createNewTraining() {
        Scanner scanner = new Scanner(System.in);
        Trainings newTraining = new Trainings();
        System.out.println("Введите значение");
        newTraining.setTraining_id(verifyIntValue(scanner,45));
        newTraining.setName_training(getString());
        System.out.println("Введите значение");
        newTraining.setTraining_type_id(verifyIntValue(scanner,45));
        newTraining.setAdditional_comment(getString());
        return newTraining;
    }

    public String addTraining(Trainings newTraining){
        Trainings trainings = newTraining;
        return trainings.getName_training()+trainings.getTraining_id()+trainings.getAdditional_comment()+trainings.getTraining_type_id();
    };

    public static int verifyIntValue(Scanner scr, int defaultValue) {
        int number;
        if (scr.hasNextInt()) {
            number = scr.nextInt();
        } else {
            number = defaultValue;
            scr.next();
            System.out.println("Вы ввели неверное значение  bad value");
        }
        return number;
    }

    public static String getString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please,input string : ");
        String str=scan.nextLine();
        return str;
    }

}
