package com.example.assignment3;
import java.io.FileInputStream;
import java.io.IOException;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
/*My name is mark jones (aka MJ) 
 * The theme of my app today is cats.  So, my screen has crazy meme cats
 * This java class was only worked on by MJ
 * */

//Music is Earthquake by DJ Fresh and Diplo
//I used the android guide to figure out how to use it.

public class Mark extends ActionBarActivity {
	boolean played;
	int w;
	int l;
	MediaPlayer media = new MediaPlayer();
	//return to the main menu
	public void goHome(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		media.stop();
		startActivity(intent);
	}
	//Clicking DJ Kitty plays music found on Android TUtorials
	public void playMusic(View view) throws IllegalArgumentException, IllegalStateException, IOException {
		String mp3File = "raw/earthquack.mp3"; //Anybody catch my funny?
		AssetManager assetMan = getAssets();
		FileInputStream mp3Stream = assetMan.openFd(mp3File).createInputStream();
		media.setDataSource(mp3Stream.getFD());
		media.prepare();
		if (!played) {
			media.start();
			played = true;
		}
		//cannot get this to work for some reason
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mark);
		// Set the text view as the activity layout setContentView(textView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mark, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
