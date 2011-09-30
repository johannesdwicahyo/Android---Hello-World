package com.capcay.haloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends Activity {
	int requestCode;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity2);
	    TextView tv = (TextView) findViewById(R.id.tv);
	    Bundle extras = getIntent().getExtras();
	    if (extras != null) {
	    	String ekstra = extras.getString("extra");
	    	tv.setText(ekstra);
	    }
         
	    
	}
	
	public void result(View v){
		Intent i = new Intent(this,Activity3.class);       
	    startActivityForResult(i, requestCode);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    if(resultCode==1){
	        Toast.makeText(this, "Berhasil Menerima Result", Toast.LENGTH_LONG).show();
	    }
	    else{
	        Toast.makeText(this, "Gagal menerima Result", Toast.LENGTH_LONG).show();
	    }
	}
	
}
