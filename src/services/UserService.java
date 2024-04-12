package services;

import in.InData;
import model.Users;
import out.OutData;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    Users user = new Users();
    List<Users> usersList = new ArrayList<>();

    private int user_authorized_id;

    public int getUser_authorized_role() {
        return user_authorized_role;
    }

    public void setUser_authorized_role(int user_authorized_role) {
        this.user_authorized_role = user_authorized_role;
    }

    private int user_authorized_role;

    public int getUser_authorized_id() {
        return user_authorized_id;
    }

    public void setUser_authorized_id(int user_authorized_id) {
        this.user_authorized_id = user_authorized_id;
    }

    public UserService() {
    }

    InData inData = new InData();
    TrainingService trainingService = new TrainingService();

    public void userRegistration(String user_login, String user_password) {
        if (usersList.isEmpty()) {
            usersList.add(new Users(0, (byte) 1, user_login, user_password));
        } else {
            for (Users currentUser :
                    usersList) {
                if (user_login.equals(currentUser.getUser_login())) {
                    System.out.println("This user alredy exist");
                    break;
                } else
                    usersList.add(new Users(usersList.size(), (byte) 1, user_login, user_password));
                System.out.println("user add");
            }
        }
    }

    public void userLogging(String user_login, String user_password) {
        for (Users currentUser :
                usersList) {
            if (user_login.equals(currentUser.getUser_login()) && user_password.equals(currentUser.getUser_password())) {
                setUser_authorized_id(currentUser.getUser_id());
                setUser_authorized_role(currentUser.getUser_role());
                userInf();
            }

        }
    }

    public void userInf() {
        OutData outData = new OutData();
        outData.mainMenuView(getUser_authorized_role());
    }

    public void userTrainingInformation(int user_id) {
        trainingService.userTrainingInformation(trainingService.userTrainingsId(user_id));
    }
}
