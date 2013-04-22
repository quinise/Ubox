package com.teamsix.uboxprototype;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class GMail extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_gmail);
			/*Intent openStartingPoint = new Intent(GMail.this,EmailReader.class);
			startActivity(openStartingPoint);*/
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
		{
			// Inflate the menu; this adds items to the action bar if it is
			// present.
			getMenuInflater().inflate(R.menu.gmail, menu);
			return true;
		}

}
