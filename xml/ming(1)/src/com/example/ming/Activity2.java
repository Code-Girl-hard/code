package com.example.ming;

import com.example.ming.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Activity2 extends Activity {
	private TextView tv_nickname;
	private TextView tv_numberShow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		tv_nickname=(TextView) findViewById(R.id.tv_nickname);
		tv_numberShow=(TextView) findViewById(R.id.tv_numberShow);
		Intent it=	getIntent();
		String nickname=it.getStringExtra("nickName");
		String numberShow=it.getStringExtra("number");
		tv_nickname.setText("êÇ³Æ£º"+nickname);
		tv_numberShow.setText("ÊÖ»úºÅ£º"+numberShow);
	}

	

}
