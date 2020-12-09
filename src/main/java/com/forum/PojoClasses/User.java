package com.forum.PojoClasses;

public class User
{
    private String userID;

    private String username;
    private String email;
    private String passwordHashed;

    private int userLevel;

    /*************************************************************************************/

    @Override
    public String toString()
    {
        return "User{" +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", passwordHashed='" + passwordHashed + '\'' +
                ", userLevel=" + userLevel +
                '}';
    }

    /*************************************************************************************/

    public String getUserID()
    {
        return userID;
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPasswordHashed()
    {
        return passwordHashed;
    }

    public int getUserLevel()
    {
        return userLevel;
    }

    /*************************************************************************************/

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPasswordHashed(String passwordHashed)
    {
        this.passwordHashed = passwordHashed;
    }

    public void setUserLevel(int userLevel)
    {
        this.userLevel = userLevel;
    }
}
