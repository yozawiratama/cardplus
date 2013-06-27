package com.cardplus;

import android.app.Activity;
import android.os.Bundle;

public class SearchNow extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_now);
		this.overridePendingTransition(R.anim.animation_enter,
                R.anim.animation_leave);
		loadActivity();
	}

	private void loadActivity() {
		// TODO Auto-generated method stub
		
	}
}
