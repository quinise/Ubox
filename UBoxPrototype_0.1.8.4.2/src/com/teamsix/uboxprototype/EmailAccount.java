package com.teamsix.uboxprototype;

public class EmailAccount {
    public String urlServer = "gmail.com";
    public String username = "kreeseeker";
    public String password = "Programming01";
    
    public String emailAddress;
    public EmailAccount(String username, String password, String urlServer) {
        
    		this.username = username;
        this.password = password;
        this.urlServer = urlServer;
        this.emailAddress = username + "@" + urlServer;
    }
}
