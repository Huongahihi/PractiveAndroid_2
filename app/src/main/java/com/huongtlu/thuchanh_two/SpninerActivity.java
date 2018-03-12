package com.huongtlu.thuchanh_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class SpninerActivity extends AppCompatActivity {
    String arr[] = {
            "Hàng điện tử",
            "Hàng hóa chất"
    };
    TextView se;
    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spniner);
        se = (TextView) findViewById(R.id.id_select);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        spin.setAdapter(arrayAdapter);
        spin.setOnItemSelectedListener(new MyProcessEvent());
        btnnext=(Button) findViewById(R.id.btnNext3);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SpninerActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        });
    }

    private class MyProcessEvent implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            se.setText(arr[i]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            se.setText("");
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        }
    }
}
