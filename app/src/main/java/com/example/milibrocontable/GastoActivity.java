package com.example.milibrocontable;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GastoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.navigation_view_gastos_name));
    }

    @Override
    public boolean onSupportNavigateUp(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return true;
    }
}
