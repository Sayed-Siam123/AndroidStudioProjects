package com.example.dayremindingsms;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView im;
	Button btn1,btn2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		im=(ImageView) findViewById(R.id.iv1);
		btn1=(Button) findViewById(R.id.btn1);
		btn2=(Button) findViewById(R.id.btn2);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId()) {
			
			case R.id.about:
				
				Intent i=new Intent(MainActivity.this,About.class);
				startActivity(i);
				return true;
				
				default:
					return super.onOptionsItemSelected(item);
					
			
		}
	  }

}
