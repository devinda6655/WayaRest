public class user
{
    private String userName;
    public String email;
    public String phone;
    public String dob;
    public String password;

    public user(char userName,String email,String phone,String dob,String password){
        this.userName=userName;
        this.email=email;
        this.phone=phone;
        this.dob=dob;
        this.password=password;
    }
    public String getuserName()
    {
        return userName;
    }
    public String getemail()
    {
        return email;
    }
    public String getdob()
    {
        return dob;
    }
    public String password()
    {
        return password;
    }    



}