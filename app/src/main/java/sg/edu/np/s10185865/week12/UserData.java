package sg.edu.np.s10185865.week12;

public class UserData {

    private String MyUserName;
    private String MyPassword;

    public UserData()
    {

    }

    public UserData(String myUserName, String myPassword)
    {
        MyPassword = myPassword;
        MyUserName = myUserName;
    }

    public String getMyUserName() {
        return MyUserName;
    }

    public String getMyPassword() {
        return MyPassword;
    }

    public void setMyUserName(String myUserName) {
        MyUserName = myUserName;
    }

    public void setMyPassword(String myPassword) {
        MyPassword = myPassword;
    }
}
