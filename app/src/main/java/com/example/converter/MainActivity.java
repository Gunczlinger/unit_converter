package com.example.converter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Start Spinner code
        Spinner classSpinner = (Spinner) findViewById(R.id.convert_class);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this,
                R.array.conversion_classes, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        classSpinner.setAdapter(classAdapter);

        ArrayAdapter<CharSequence> tempAdapter = ArrayAdapter.createFromResource(this,
               R.array.temp_conversion, android.R.layout.simple_spinner_item);
        tempAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> distAdapter = ArrayAdapter.createFromResource(this,
               R.array.dist_conversion, android.R.layout.simple_spinner_item);
        distAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> weightAdapter = ArrayAdapter.createFromResource(this,
               R.array.weight_conversion, android.R.layout.simple_spinner_item);
        weightAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner inSpinner = (Spinner) findViewById(R.id.in_spinner);
        inSpinner.setAdapter(tempAdapter);

        Spinner outSpinner = (Spinner) findViewById(R.id.out_spinner);
        outSpinner.setAdapter(tempAdapter);


//break here @Responding to User Selections
        //End Spinner code

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setOptions(string opt)
        switch(opt){
        case "t":
            break;
        case "d":
            break;
        case "w":
            break;
        default:
            ;
        }
}