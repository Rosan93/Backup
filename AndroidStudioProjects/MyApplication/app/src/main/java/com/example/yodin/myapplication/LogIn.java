package com.example.yodin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    EditText UserName, Password;
    Button Login;
    String user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        UserName = (EditText)findViewById(R.id.editText1);
        Password = (EditText)findViewById(R.id.editText2);
        Login = (Button)findViewById(R.id.button);

    }

    /*Login.setOnClickListener(new View.OnClickListener()
    {
        @Override
         public void onClick(View view)
        {
            validate(UserName.getText().toString(), Password.getText().toString());
        }
    }); */


    public void Jump(View view)
    {
        user = UserName.getText().toString();
        password = Password.getText().toString();

        if((user.equals("user")) && (password.equals("user")))
        {
            Intent intent = new Intent(this, Addition.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Username or Password is wrong", Toast.LENGTH_SHORT);
            toast.show();
       }
    }
}
