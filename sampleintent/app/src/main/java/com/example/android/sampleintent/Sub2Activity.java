package com.example.android.sampleintent;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2Activity extends ActionBarActivity {

    public static String KEY_DATA = "data";
    private String receivedData = null;
    private TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        txtData =(TextView)findViewById(R.id.txt_data);
        receivedData =getIntent().getStringExtra(KEY_DATA);
        txtData.setText(receivedData);
    }
}
