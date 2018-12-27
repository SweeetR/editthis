package com.example.user.editthis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText ed1;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.tv1);
        ed1=(EditText) findViewById(R.id.ed1);
    }

    public void send(View view) {
        st=ed1.getText().toString();
        tv1.setText(st);
    }
}
