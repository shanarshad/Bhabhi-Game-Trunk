package com.android.bhabitest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class noPlayers extends Activity implements SeekBar.OnSeekBarChangeListener {
    /** Called when the activity is first created. */
   
	SeekBar mSeekBar;
    TextView mProgressText;
    TextView mTrackingText;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_players);
        mSeekBar = (SeekBar)findViewById(R.id.seekBar1);
        mSeekBar.setOnSeekBarChangeListener(this);
        mProgressText = (TextView)findViewById(R.id.progress);
        
       
        
        Button btnsGame = (Button)findViewById(R.id.sGame);
        btnsGame.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {
           Intent i = new Intent(noPlayers.this, pSolo.class);
           startActivity(i);
           }
        });
    }
	
	
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		// TODO Auto-generated method stub
		
	}
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
}