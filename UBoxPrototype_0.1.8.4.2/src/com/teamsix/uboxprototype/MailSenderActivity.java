package com.teamsix.uboxprototype;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MailSenderActivity extends Activity {
	
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_sender);
        
        final EditText to = (EditText) findViewById(R.id.to);
        final  EditText subject = (EditText) findViewById(R.id.subject);
         final EditText body = (EditText) findViewById(R.id.body);

        final Button send = (Button) this.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                

                try {   
                   /* GmailSender sender = new GmailSender("kreeseeker@gmail.com", "Programming01");                    //Login info
                    sender.sendMail("This is the Subject of a Email sent from an emulator",                          //Subject
                    		"This is the Body of an email sent by an emulator"                                      //Body
                    		,"kreeseeker@gmail.com","mrjaw2@yahoo.com, media-d@live.com, jawshouamoua@gmail.com");*/ //TO
                	
                	//GmailSender sender = new GmailSender ("kreeseeker@gmail.com","Programming01");
                	
                	//yahoo attempt.................
                	SendYahoo sy  = new SendYahoo(1);
                	SendYahoo.send();
                	
                	
                	
                	//sender.sendMail(subject.getText().toString(),body.getText().toString(), "kreeseeker@gmail.com",to.getText().toString() );
                    //I don't know about cc and bcc
                	
                	//yahoo attempt also...........
                	//((Object) sy).sendMail(subject.getText().toString(),body.getText().toString(), "kreeseeker@yahoo.com",to.getText().toString() );
                	
                	
                } catch (Exception e) {   													               
                	
                	
                    Log.e("SendMail", e.getMessage(), e);   
                } 

            }
        });

    }
}