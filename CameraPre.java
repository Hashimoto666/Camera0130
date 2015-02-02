package com.example.soematsu.camera0130;

import android.app.Activity;
import android.os.Bundle;

public class CameraPre extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.soematsu.camera0130.CameraView view = new com.example.soematsu.camera0130.CameraView(this);
        setContentView(view);
        //setContentView(R.layout.main);
    }

    protected void onResume(){
        super.onResume();
    }

    protected void onStop(){
        super.onStop();
    }

    public void onDestroy(){
        super.onDestroy();
    }
}
