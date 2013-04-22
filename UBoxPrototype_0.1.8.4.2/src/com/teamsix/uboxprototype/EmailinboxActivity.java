package com.teamsix.uboxprototype;

import javax.mail.MessagingException;

import android.app.Activity;
import android.os.Bundle;

public class EmailinboxActivity extends Activity
{
	/** Called when the activity is first created. */
	EmailReader emailManager;
	private String stmpHost = "smtp.gmail.com";
	private String mailServer = "imap.gmail.com";
	public String urlServer = "gmail.com";
	public String username = " kreeseeker";
	public String password = " Programming01";

	@Override
	public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_emailinbox);
			emailManager = new EmailReader(username, password, urlServer,
					stmpHost, mailServer);
			// emailManager.getInboxMails();
			emailManager.close();

		}
}