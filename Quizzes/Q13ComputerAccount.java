public class Q13ComputerAccount {
/*
 we only use get and set here because its basically a 'base' of data
 that we should get the data and set the data on.
 */
    private String realName,userName,password;

    //get and set
    public String getRealName() {
        return realName;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Q13ComputerAccount(String realname,String username, String passwords){
        this.password =passwords;
        this.realName =realname;
        this.userName =username;
    }
}
