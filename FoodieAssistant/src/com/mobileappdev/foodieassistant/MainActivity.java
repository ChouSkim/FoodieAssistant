package com.mobileappdev.foodieassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageView startUpPicture = (ImageView) findViewById(R.id.startUpPicture);

		// set onClickListener for ImageView
		startUpPicture.setOnClickListener(new newActivityListener());

		// start second layout

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// Inner class for create a listener for OnClickListener
	public class newActivityListener implements OnClickListener {
		private static final int RESULT_CODE = 1;

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, SecondActivity.class);
			startActivityForResult(intent, RESULT_CODE);
		}
	}
}
