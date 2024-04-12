package services;

import in.InData;
import model.TrainingType;
import model.Trainings;
import model.UserTrainings;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainingService {

    List<UserTrainings> trainingList = new ArrayList<>();


    List<Trainings> trainingsList = new ArrayList<>();
    List<TrainingType> trainingTypeList = new ArrayList<>();

    public String string = "";

    InData inData = new InData();

    public Trainings createNewTraining() {
        Trainings newTraining = new Trainings();

        System.out.println("Введите Идентификационный номер тренировки :");
        newTraining.setTraining_id(inData.getVerifyIntValue(45));

        System.out.println("Введите название тренировки :");
        newTraining.setName_training(inData.getVerifyString());

        System.out.println("Введите Идентификационный номер типа тренировки :");
        newTraining.setTraining_type_id(inData.getVerifyIntValue(45));

        System.out.println("Введите свой комментарий :");
        newTraining.setAdditional_option(inData.getVerifyString());

        System.out.println("Введите Дату тренировки :");
        newTraining.setDate_training(new Date(inData.getVerifyDate()));

        System.out.println("Введите количество калорий потраченых на тренировке :");
        newTraining.setCount_spent_calories(inData.getVerifyIntValue(0));

        System.out.println("Введите время тренировки :");
        newTraining.setTime_training(inData.getVerifyString());

        trainingsList.add(newTraining);

        return newTraining;
    }

    public List<Integer> userTrainingsId(int user_id) {
        List<Integer> userTrainingId = new ArrayList<>();
        for (UserTrainings trainingCurrentUser :
                trainingList) {
            if (user_id == trainingCurrentUser.getUser_id())
                userTrainingId.add(trainingCurrentUser.getTraining_id());
        }
        return userTrainingId;
    }

    public String userTrainingInformation(List<Integer> userTrainings) {
        for (int userTrainingId :
                userTrainings) {
            string += getTrainingById(userTrainingId);
        }
        return string;
    }

    public void addTrainingToUser(int trainingId, int userId) {
        System.out.println("Введите идентификационный номер тренировки которую хотите добавить : ");
        trainingList.add(new UserTrainings(userId, trainingId));
    }

    public void getAllTraining() {
        for (Trainings trainings :
                trainingsList) {
            System.out.println(" Training name : " + trainings.getName_training() +
                    " Training time : " + trainings.getTime_training() +
                    " Training date : " + trainings.getDate_training() +
                    " Training option : " + trainings.getAdditional_option() +
                    " Training calories : " + trainings.getCount_spent_calories() +
                    " Training type id : " + trainings.getTraining_type_id() +
                    " Training id : " + trainings.getTraining_id());

        }
    }

    public String getTrainingById(int training_id) {

        return " Training name : " + trainingsList.get(training_id).getName_training() +
                " Training time : " + trainingsList.get(training_id).getTime_training() +
                " Training date : " + trainingsList.get(training_id).getDate_training() +
                " Training option : " + trainingsList.get(training_id).getAdditional_option() +
                " Training calories : " + trainingsList.get(training_id).getCount_spent_calories() +
                " Training type id : " + trainingTypeList.get(trainingsList.get(training_id).getTraining_type_id()) +
                " Training id : " + trainingsList.get(training_id).getTraining_id() + "\n";

    }

    public void addCategoryOfTraining() {
        TrainingType newTrainingType = new TrainingType();
        System.out.println("Введите идентификатор типа тренировки");
        newTrainingType.setTraining_type_id(inData.getVerifyIntValue(0));
        System.out.println("Введите название типа тренировки");
        newTrainingType.setTraining_name_type(inData.getVerifyString());
        trainingTypeList.add(newTrainingType);

    }

    public void getAllCategory() {
        for (TrainingType trainingType :
                trainingTypeList) {
            System.out.println(trainingType.getTraining_name_type() + trainingType.getTraining_type_id());
        }
    }
}
