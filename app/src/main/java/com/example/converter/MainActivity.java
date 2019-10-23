package com.example.converter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private int inFactor;
    private int outFactor;
    private enum Conversion {TEMP, DIST, WEIGHT;}
    public Spinner classSpinner;
    public Spinner inSpinner;
    public Spinner outSpinner;
    public ArrayAdapter<CharSequence> classAdapter;
    public ArrayAdapter<CharSequence> tempAdapter;
    public ArrayAdapter<CharSequence> distAdapter;
    public ArrayAdapter<CharSequence> weightAdapter;
    public Conversion convertType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Start Spinner code
        classSpinner = (Spinner) findViewById(R.id.convert_class);
        // Create an ArrayAdapter using the string array and a default spinner layout
        classAdapter = ArrayAdapter.createFromResource(this,
                R.array.conversion_classes, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        classSpinner.setAdapter(classAdapter);
        classSpinner.setOnItemSelectedListener(this); //What's wrong here?


        tempAdapter = ArrayAdapter.createFromResource(this,
               R.array.temp_conversion, android.R.layout.simple_spinner_item);
        tempAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        distAdapter = ArrayAdapter.createFromResource(this,
               R.array.dist_conversion, android.R.layout.simple_spinner_item);
        distAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightAdapter = ArrayAdapter.createFromResource(this,
               R.array.weight_conversion, android.R.layout.simple_spinner_item);
        weightAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        inSpinner = (Spinner) findViewById(R.id.in_spinner);
        inSpinner.setAdapter(tempAdapter);
        inSpinner.setOnItemSelectedListener(this); //What's wrong here?


        outSpinner = (Spinner) findViewById(R.id.out_spinner);
        outSpinner.setAdapter(tempAdapter);
        outSpinner.setOnItemSelectedListener(this); //What's wrong here?


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

    private void setOptions(String opt) {
        switch (opt) {
            case "t":
                inSpinner.setAdapter(tempAdapter);
                outSpinner.setAdapter(tempAdapter);
                break;
            case "d":
                inSpinner.setAdapter(distAdapter);
                outSpinner.setAdapter(distAdapter);
                break;
            case "w":
                inSpinner.setAdapter(weightAdapter);
                outSpinner.setAdapter(weightAdapter);
                break;
            default:
                inSpinner.setAdapter(weightAdapter);
                outSpinner.setAdapter(weightAdapter);
                ;
        }
    }

    public float convert(){
        switch(convertType){
            return 1;
        }
        return 1;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Spinner selected = (Spinner) parent;
        int i = selected.getSelectedItemPosition();
        switch(selected.getId()){
            case R.id.convert_class:
                switch(i){
                    case 0:
                        setOptions("t");
                        convertType = Conversion.TEMP;
                        break;
                    case 1:
                        setOptions("d");
                        convertType = Conversion.DIST;
                        break;
                    case 2:
                        setOptions("w");
                        convertType = Conversion.WEIGHT;
                        break;
                    default:
                        setOptions("");
                        break;
                }
                break;
            case R.id.in_spinner:
                switch
                break;
            case R.id.out_spinner:
                break;
        }
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
