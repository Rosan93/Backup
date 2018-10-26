package com.example.yodin.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class Order extends AppCompatActivity {

    int quantity = 0;
    String priceMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void add(View v)
    {
        if(quantity==100)
        {
            Toast.makeText(Order.this,"You cannot have more than 100cups of coffee",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity++ ;
        display(quantity);
    }

    public void subtract(View v)
    {
        if(quantity==1)
        {
            Toast.makeText(Order.this,"You cannot have less than 1cup of coffee",Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            quantity-- ;
            display(quantity);
        }

    }

    public void submitOrder(View v)
    {
        EditText name = (EditText) findViewById(R.id.name);
        String value = name.getText().toString();

        CheckBox cherryCheck = (CheckBox)findViewById(R.id.check1);
        boolean hasCherry = cherryCheck.isChecked();

        CheckBox chocolateCheck = (CheckBox)findViewById(R.id.check2);
        boolean hasChocolate = chocolateCheck.isChecked();

        calculatePrice(quantity,value,hasCherry,hasChocolate);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        //intent.putExtra(Intent.EXTRA_EMAIL,addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Just Java app for:" + value);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if(intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }


        //displayMessage(priceMessage);
    }

    private void display(int number)
    {
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private String calculatePrice(int quantityC, String name, boolean hasCherry,boolean hasChocolate)
    {
//        TextView orderTextView = (TextView)findViewById(R.id.order_text_view);
//        orderTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        int base = 5;
        if(hasCherry==true)
        {
            base += 2;
        }
        if (hasChocolate==true)
        {
            base += 4;
        }

        int price = base * quantity;

        priceMessage = "Name: " + name;
        priceMessage += "\nAdd cherry? " + hasCherry;
        priceMessage += "\nAdd chocolate? " + hasChocolate;
        priceMessage += "\nTotal Price: $" + price;
        priceMessage += "\nTotal Quantity: " + quantity;
        priceMessage += "\nThank you! Visit Again";
        return priceMessage;
    }


    private void displayMessage(String message)
    {
        TextView orderTextView = (TextView)findViewById(R.id.order_text_view);
        orderTextView.setText(message);
    }
}
