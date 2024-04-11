package model;

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

    public String getAdditional_comment() {
        return additional_comment;
    }

    public void setAdditional_comment(String additional_comment) {
        this.additional_comment = additional_comment;
    }

    private String name_training;
    private String additional_comment;
    private int training_type_id;

    public Trainings(int training_id, String name_training, String additional_comment, int training_type_id) {
        this.training_id = training_id;
        this.name_training = name_training;
        this.additional_comment = additional_comment;
        this.training_type_id = training_type_id;
    }

    public int getTraining_type_id() {
        return training_type_id;
    }

    public void setTraining_type_id(int training_type_id) {
        this.training_type_id = training_type_id;
    }
}
