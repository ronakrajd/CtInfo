package com.example.ronakrajdoongarwal.ctinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView ;
    Intent i;
    public static String scapital="";
    public static String sdescription="";
    final String[] states = new String[] { "Rajasthan",
            "Haryana",
            "Karnataka",
            "Bihar",
            "Madhya Pradesh",
            "Gujrat"

    };
    final String[] capitals = new String[]{
            "Jaipur",
            "Chandigarh",
            "Bangalore",
            "Patna",
            "Bhopal",
            "GandhiNagar"

    };
    final String[] description={
      "This is description0",
            "This is description1",
            "This is description2",
            "This is description3",
            "This is description4",
            "This is description5",
            "This is description6"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main       );

        listView = (ListView) findViewById(R.id.listView);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_activated_1, android.R.id.text1, states);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String itemValue = (String) listView.getItemAtPosition(position);
                i=new Intent(MainActivity.this,Rajasthan.class);
                scapital=capitals[position];
                sdescription=description[position];
                startActivity(i);

                Toast.makeText(getApplicationContext(),
                        "Position :" + position + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();

            }

        });
    }
}
