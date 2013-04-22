package com.teamsix.uboxprototype;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class EmailAuthenticator extends Authenticator   {
    private EmailAccount account;
    public EmailAuthenticator(EmailAccount account) {
        super();
        this.account = account;
    }
    protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(account.emailAddress, account.password);  
    } 
}