package com.huongtlu.thuchanh_two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewNCActivity extends AppCompatActivity {
    ListView lst;
    ArrayList<monhoc> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_nc);
        lst = (ListView) findViewById(R.id.lsView);
        //data source
        arr = new ArrayList<monhoc>();
        arr.add(new monhoc("Android", "phu thu nhat", 2, 'A'));
        arr.add(new monhoc("Java", "2", 1, 'B'));
        arr.add(new monhoc("Lich su Dang", "1", 2, 'C'));

        //ArrayAdapter lam cau noi
        customAdapter adapter = new customAdapter(this, arr);
        lst.setAdapter(adapter);
    }

}

