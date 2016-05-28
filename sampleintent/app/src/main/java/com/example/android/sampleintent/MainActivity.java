package com.example.android.sampleintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    private Button btnSub1, btnSub2, btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSub1 = (Button)findViewById(R.id.btn_actvity_sub_1);
        btnSub2 = (Button)findViewById(R.id.btn_actvity_sub_2);
        btnDial = (Button)findViewById(R.id.btn_actvity_dial);

        btnSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        btnSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                intent.putExtra(Sub2Activity.KEY_DATA, "Training aplikasi Android");
                startActivityForResult(intent, 1);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String number = "1234567890";
                Uri Number = Uri.parse("tel:" + number);
                Intent dial = new Intent(Intent.ACTION_DIAL);
                dial.setData(Number);
                startActivity(dial);
                */
                Uri number = Uri.parse("tel: 08963451822");
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(number);
                startActivity(call);
            }
        });
    }
}
