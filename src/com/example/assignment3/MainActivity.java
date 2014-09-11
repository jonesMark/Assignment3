//update by PRofessor U.
//Second update by Mark Jones 9/9/14
//Created by Mark Jones, Lauren Naylor, and Chris Seigel
package com.example.assignment3;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//Mark Jones:
//Music is Earthquack by DJ Fresh and Diplo
//I used the android guide to figure out how to use it.
//Make sure a button is added- MJ

public class MainActivity extends ActionBarActivity {
	
	public void toBeatlesScreen(View view) {
		Intent intent = new Intent(this, Lauren.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
