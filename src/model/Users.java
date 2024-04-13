package model;

public class Users {

    private int user_id;

    private byte user_role;

    public Users(int user_id, byte user_role, String user_login, String user_password) {
        this.user_id = user_id;
        this.user_role = user_role;
        this.user_login = user_login;
        this.user_password = user_password;
    }

    public byte getUser_role() {
        return user_role;
    }

    public void setUser_role(byte user_role) {
        this.user_role = user_role;
    }

    public Users() {
    }

    private String user_login;
    private String user_password;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
