package com.example.anoop.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowDonors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_donors);
    }

    public void yourDetails(View view){

        Intent intent=new Intent(ShowDonors.this,YourDetails.class);
        startActivity(intent);
    }
}
