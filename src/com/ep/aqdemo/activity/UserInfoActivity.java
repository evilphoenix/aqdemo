package com.ep.aqdemo.activity;

import com.ep.aqdemo.base.BaseActivity;
import com.ep.demo.R;

import android.os.Bundle;
import android.view.Menu;

public class UserInfoActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.loading, menu);
		return true;
	}

}
