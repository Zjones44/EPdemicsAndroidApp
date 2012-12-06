package com.example.epdemicsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnSimple = (Button) findViewById(R.id.button1);
        btnSimple.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v){
        		
        		Intent intent = new Intent (v.getContext(), epActivity.class);
        		startActivityForResult(intent, 0);
        	}

			
        	
        });
    }


}