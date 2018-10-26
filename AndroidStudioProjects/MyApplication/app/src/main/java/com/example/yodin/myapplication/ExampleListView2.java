package com.example.yodin.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ExampleListView2 extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView l;
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_list_view2);

        l = (ListView)findViewById(R.id.listView2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ExampleListView2.this,android.R.layout.simple_list_item_1, days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(ExampleListView2.this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        /*TextView temp = (TextView) view;
        Toast.makeText(ExampleListView2.this, temp.getText() + "" + i, Toast.LENGTH_SHORT).show(); */
        Fragment fr1;

        /*if(i == 0)
        {
            fr1 = new ListFragment();
        }
        else
        {
            fr1 = new ListFragment();
        }*/

        int sw = i;

        switch (sw)
        {
            case 0:
                fr1 = new ListFragment();
                break;
            case 1:
                fr1 = new ListFragment1();
                break;
            default:
                fr1 = new ListFragment2();
                break;
        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment3,fr1);
        ft.commit();
    }
}
