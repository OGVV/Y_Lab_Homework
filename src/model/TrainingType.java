package model;

public class TrainingType {
    private int training_type_id;
    private String training_name_type;

    public int getTraining_type_id() {
        return training_type_id;
    }

    public void setTraining_type_id(int training_type_id) {
        this.training_type_id = training_type_id;
    }

    public String getTraining_name_type() {
        return training_name_type;
    }

    public void setTraining_name_type(String training_name_type) {
        this.training_name_type = training_name_type;
    }

    public TrainingType() {
    }

    public TrainingType(int training_type_id, String training_name_type) {
        this.training_type_id = training_type_id;
        this.training_name_type = training_name_type;
    }
}
