public class User {
    private String userName;
    private String hashPassword;

    public User(String userName, String hashPassword) {
        this.userName = userName;
        this.hashPassword = hashPassword;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }


}

