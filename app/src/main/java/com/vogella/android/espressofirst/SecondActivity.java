package com.vogella.android.espressofirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mplanas on 25/04/2017.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_second);
        TextView viewById = (TextView) findViewById(R.id.resultView);
        Bundle inpuntData = getIntent().getExtras();
        String inpunt = inpuntData.getString("input");
        viewById.setText(inpunt);

    }
}
