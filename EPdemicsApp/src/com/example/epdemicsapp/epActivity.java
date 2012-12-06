package com.example.epdemicsapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class epActivity extends Activity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.ep_player);
	
	
	MediaPlayer mp = MediaPlayer.create(this, R.raw.test_cbr);
	mp.start();
	}
}
