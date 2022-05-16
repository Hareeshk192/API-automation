package com.project.inforgenerator.entities;

public class users {
    private long id;
    private String email;
    private String password;


    public users(long id, String email, String password) {
        super();
        this.id = id;
        this.email =email;
        this.password= password;
    }
    public users()
    {
        super();
    }
    public void setId(long id)
    {
        this.id=id;
    }
    public void setEmail(String email)
    {
        this.email =email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
