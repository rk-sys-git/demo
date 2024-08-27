package Source;

public class Authentication {
    private String userName;
    private String passWord;
    private Boolean forceBasicAuthentication;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Boolean getForceBasicAuthentication() {
        return forceBasicAuthentication;
    }

    public void setForceBasicAuthentication(Boolean forceBasicAuthentication) {
        this.forceBasicAuthentication = forceBasicAuthentication;
    }
}
