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
//Button is for chris to link app
public class MainActivity extends ActionBarActivity {
	
	public void toBeatlesScreen(View view) {
		Intent intent = new Intent(this, Lauren.class);
		startActivity(intent);
	}

	//Send person to Mark Page //MJ edited this
	public void toTheAwesomeness(View view) {
		Intent intent = new Intent(this, Mark.class);
		startActivity(intent);
	}
	
	public void toChris(View view) {
	    Intent intent = new Intent(this, Chris.class);
	    EditText editText = (EditText) findViewById(R.id.edit_message);
	    String message = editText.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, message);
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
