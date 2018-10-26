package com.example.yodin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ExampleListView extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView l;
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_list_view);

        l = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ExampleListView.this,android.R.layout.simple_list_item_1, days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(ExampleListView.this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView temp = (TextView) view;
        Toast.makeText(ExampleListView.this, temp.getText() + "" + i, Toast.LENGTH_SHORT).show();
    }
}
