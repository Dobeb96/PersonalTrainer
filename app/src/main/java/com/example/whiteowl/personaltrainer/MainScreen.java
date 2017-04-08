package com.example.whiteowl.personaltrainer;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.whiteowl.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        // tutaj sobie coś pozmieniam
    }

    public void add(View view) {
        operation(1);
    }

    public void sub(View view) {
        operation(-1);
    }

    private void operation(int op) {
        TextView number = (TextView) findViewById(R.id.number_id);
        int nm = Integer.parseInt(number.getText().toString());
        nm += op;
        number.setText("" + nm);
    }

    public void secondPage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        TextView editText = (TextView) findViewById(R.id.number_id);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
