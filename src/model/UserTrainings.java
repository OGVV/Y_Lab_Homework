package model;

public class UserTrainings {
    private String user_id;
    private String training_id;

    public UserTrainings() {
    }

    public UserTrainings(String user_id, String training_id) {
        this.user_id = user_id;
        this.training_id = training_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTraining_id() {
        return training_id;
    }

    public void setTraining_id(String training_id) {
        this.training_id = training_id;
    }
}
