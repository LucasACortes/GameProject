package domain;

import java.sql.Date;

public class Usuario {

    private String name;
    private String eMail;
    private Date verificationDate;
    private String password;

    public Usuario() {
    }

    public Usuario(String name, String eMail, Date verificationDate, String password) {
        this.name = name;
        this.eMail = eMail;
        this.verificationDate = verificationDate;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
