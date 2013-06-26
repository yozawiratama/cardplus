package com.cardplus;

import java.util.ArrayList;
import java.util.Arrays;

import android.R.array;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	String[] menuItems = new String[]{
			"Search now", "Weather"
	};
	private ListView menuListView;
	private ArrayAdapter<String> listAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		loadActivity();
	}

	private void loadActivity() {
		// TODO Auto-generated method stub
		menuListView = (ListView)findViewById(R.id.menu_list);
		ArrayList<String> menuList = new ArrayList<String>();
		menuList.addAll(Arrays.asList(menuItems));
		
		listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuList);
		
		menuListView.setAdapter(listAdapter);
		setEvent();
	}

	private void setEvent() {
		// TODO Auto-generated method stub
		menuListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parentView, View childView, int position,
					long id) {
				// TODO Auto-generated method stub
				if(position == 0){
					Intent intent = new Intent(getApplicationContext(), SearchNow.class);
					startActivity(intent);
				}
				else if(position == 1){
					Intent intent = new Intent(getApplicationContext(), weather.class);
					startActivity(intent);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
