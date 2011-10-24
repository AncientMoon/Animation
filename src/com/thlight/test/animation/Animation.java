package com.thlight.test.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Animation extends Activity 
{
	private ImageView rocketImage = null;
	private Button mBtnTarget = null;
	AnimationDrawable rocketAnimation;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        rocketImage = (ImageView) findViewById(R.id.imageView1); 
 //       mBtnTarget = (Button) findViewById(R.id.b_main_target);
        rocketImage.setBackgroundResource(R.drawable.animation);  
        
        
       
		
       
        
   //     myClickHandler(imageView);
    }  
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
    	
    }
    public void onWindowFocusChanged(boolean hasFocus) {
        // TODO Auto-generated method stub
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus){
        	thread.start();                       
        }
}
    Thread thread = new Thread() {
		@Override
		public void run() {
			
			rocketAnimation.start();
		}
	};
	/*
    public void myClickHandler(View targetButton)
    {  
        // 获取AnimationDrawable对象  
        AnimationDrawable animationDrawable = (AnimationDrawable)rocketImage.getBackground();  
          
        // 动画是否正在运行  
        if(animationDrawable.isRunning()){  
            //停止动画播放  
            animationDrawable.stop();  
        }  
        else{  
            //开始或者继续动画播放  
            animationDrawable.start();  
        }  
          
          
    }  
    public boolean onTouchEvent(MotionEvent event) {
    	  if (event.getAction() == MotionEvent.ACTION_DOWN) {
    	    rocketAnimation.start();
    	    return true;
    	  }
    	  return super.onTouchEvent(event);
    	}
    */
}