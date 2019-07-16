package com.example.anoop.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    Spinner spinnerBlood,spinnerDistrict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Spinner element
        spinnerBlood = (Spinner) findViewById(R.id.spinnerBlood);
        // Spinner element
        spinnerDistrict = (Spinner) findViewById(R.id.spinnerDistrict);

        // Spinner click listener
        spinnerBlood.setOnItemSelectedListener(this);
        // Spinner click listener
        spinnerDistrict.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("A +ve");
        categories.add("B +ve");
        categories.add("AB +ve");
        categories.add("O +ve");
        categories.add("A -ve");
        categories.add("B -ve");
        categories.add("AB -ve");
        categories.add("O -ve");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerBlood.setAdapter(dataAdapter);

        // Spinner Drop down elements
        List<String> categoriesDistrict = new ArrayList<String>();
        categoriesDistrict.add("Alappuzha");
        categoriesDistrict.add("Ernakulam");
        categoriesDistrict.add("Iduki");
        categoriesDistrict.add("Kannur");
        categoriesDistrict.add("Kasaragod");
        categoriesDistrict.add("Kollam");
        categoriesDistrict.add("Kottayam");
        categoriesDistrict.add("Kozhikode");

        categoriesDistrict.add("Malappuram");
        categoriesDistrict.add("Palakkad");
        categoriesDistrict.add("Pathanamthitta");
        categoriesDistrict.add("Thiruvananthapuram");
        categoriesDistrict.add("Thrissur");
        categoriesDistrict.add("Wayanad");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapterDistrict = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categoriesDistrict);

        // Drop down layout style - list view with radio button
        dataAdapterDistrict.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerDistrict.setAdapter(dataAdapterDistrict);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void yourDetails(View view){

        Intent intent=new Intent(MainActivity.this,YourDetails.class);
        startActivity(intent);


    }
    public void search(View view){
        Intent intent=new Intent(MainActivity.this,ShowDonors.class);
        startActivity(intent);

    }
}
