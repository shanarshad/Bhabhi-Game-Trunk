package com.android.bhabitest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BhabiTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnSetting = (Button)findViewById(R.id.setting);
        btnSetting.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {
           Intent i = new Intent(BhabiTestActivity.this, settings.class);
           startActivity(i);
           }
        });
        
        Button btnpSolo = (Button)findViewById(R.id.pSolo);
        btnpSolo.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {
           Intent i = new Intent(BhabiTestActivity.this, noPlayers.class);
           startActivity(i);
           }
        });
        
        Button btnRules = (Button)findViewById(R.id.rules);
        btnRules.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {
           Intent i = new Intent(BhabiTestActivity.this, rules.class);
           startActivity(i);
           }
        });
    }
}