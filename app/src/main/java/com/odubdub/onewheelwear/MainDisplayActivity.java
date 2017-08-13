package com.odubdub.onewheelwear;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class MainDisplayActivity extends WearableActivity {

    private TextView speedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_display);

        speedTextView = (TextView) findViewById(R.id.speed_text);

        // Enables Always-on
        setAmbientEnabled();
    }
}
