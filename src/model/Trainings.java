package model;

import java.util.Date;

public class Trainings {

    public Trainings() {
    }

    private int training_id;

    public int getTraining_id() {
        return training_id;
    }

    public void setTraining_id(int training_id) {
        this.training_id = training_id;
    }

    public String getName_training() {
        return name_training;
    }

    public void setName_training(String name_training) {
        this.name_training = name_training;
    }

    public String getAdditional_option() {
        return additional_option;
    }

    public void setAdditional_option(String additional_option) {
        this.additional_option = additional_option;
    }

    private String name_training;
    private String additional_option;
    private int training_type_id;

    private Date date_training;

    private String time_training;

    public Date getDate_training() {
        return date_training;
    }

    public void setDate_training(Date date_training) {
        this.date_training = date_training;
    }

    public String getTime_training() {
        return time_training;
    }

    public void setTime_training(String time_training) {
        this.time_training = time_training;
    }

    public int getCount_spent_calories() {
        return count_spent_calories;
    }

    public void setCount_spent_calories(int count_spent_calories) {
        this.count_spent_calories = count_spent_calories;
    }

    private int count_spent_calories;

    public Trainings(int training_id, String name_training, String additional_option, int training_type_id, Date date_training, String time_training, int count_spent_calories) {
        this.training_id = training_id;
        this.name_training = name_training;
        this.additional_option = additional_option;
        this.training_type_id = training_type_id;
        this.date_training = date_training;
        this.time_training = time_training;
        this.count_spent_calories = count_spent_calories;
    }

    public int getTraining_type_id() {
        return training_type_id;
    }

    public void setTraining_type_id(int training_type_id) {
        this.training_type_id = training_type_id;
    }
}
