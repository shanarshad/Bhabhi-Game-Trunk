package com.android.bhabitest;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class pSolo extends Activity {
	/** Called when the activity is first created. */
	public View mainView = null; 

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.p_solo);
		mainView = (RelativeLayout)findViewById(R.id.rel2);
		ImageView buttonZoomIn = (ImageView)findViewById(R.id.imageView1);

		buttonZoomIn.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				zoom(2f,2f,new PointF(0,0));   
			}
		});
	}

	public void zoom(Float scaleX,Float scaleY,PointF pivot){
		
		mainView.setPivotX(pivot.x);
		mainView.setPivotY(pivot.y);  
		mainView.setScaleX(scaleX);
		mainView.setScaleY(scaleY);  
	} 
}