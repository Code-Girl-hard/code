package com.example.ming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class Activity1 extends Activity {
	private Button btn_regist;
	private EditText edtTxt_number;
	private EditText edtTxt_nickName;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity1);
		edtTxt_number=(EditText)findViewById(R.id.edtTxt_number);
		edtTxt_nickName=(EditText)findViewById(R.id.edtTxt_nickName);
		btn_regist = (Button) findViewById(R.id.btn_regist);
		
		btn_regist.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(Activity1.this,Activity2.class);
				String number=edtTxt_number.getText().toString().trim();
				String nick=edtTxt_nickName.getText().toString().trim();
				it.putExtra("number", number);
				it.putExtra("nickName", nick);
				startActivity(it);

				
			}
		});
		
		
	}

	

}
