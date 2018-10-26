package com.example.yodin.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.GetChars;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ToastMessage extends AppCompatActivity {

    EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_message);
    }

    public void onDisplay(View v)
    {
        /*Context context = getApplicationContext();
        edit = (EditText)findViewById(R.id.editText1);
        String message = edit.getText().toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(ToastMessage.this, messsage, duration);
        toast.show(); */


        Context context = getApplicationContext();
        CharSequence text =  "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text , duration);
        toast.show();
    }
}
