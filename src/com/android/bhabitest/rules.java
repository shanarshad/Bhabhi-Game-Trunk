package com.android.bhabitest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class rules extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        
        TextView helloTxt = (TextView)findViewById(R.id.hellotxt);
        helloTxt.setText(readTxt());
    }

    private String readTxt(){

        InputStream inputStream = getResources().openRawResource(R.raw.rules);
        
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        int i;
     try {
      i = inputStream.read();
      while (i != -1)
         {
          byteArrayOutputStream.write(i);
          i = inputStream.read();
         }
         inputStream.close();
     } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
     }
     
        return byteArrayOutputStream.toString();
       }
}