package com.teamsix.uboxprototype;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity
{
	MediaPlayer ourSong;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_splash);
			 ourSong = MediaPlayer.create(Splash.this, R.raw.sound);
			ourSong.start();
			Thread timer = new Thread()
			{
					public void run()
						{
							try
								{
								sleep(1500);
								
								}
							catch(InterruptedException e)
								{
								e.printStackTrace();
								System.out.println("Interruption in the Splash thread.");
								}
							finally
							{
								Intent openStartingPoint = new Intent(Splash.this,MainMenu.class);
								startActivity(openStartingPoint);
								
							}
						}
			};//End of thread definition.
			timer.start();
			
			

			/*int secondsDelayed = 1;
			new Handler().postDelayed(new Runnable()
			{
				public void run()
					{
						startActivity(new Intent(Splash.this,
								StartingPoint.class));
						finish();
					}
			}, secondsDelayed * 1000);*/
		}

	@Override
	protected void onPause()
		{
			
			super.onPause();
			ourSong.release();
			finish();
		}

}
