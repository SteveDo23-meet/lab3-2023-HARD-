package com.example.lab3;

public class User {
    private String Name;
    private String Email;
    private int Password;

    public User(String Name , String Email , int Password){
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
    }
    //------------------------------
    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    public int getPassword(){
        return Password;
    }
    //----------------------------------
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "User{" +"name='" + this.Name + '\'' + ", Email =" + this.Email +'}';
    }
}




