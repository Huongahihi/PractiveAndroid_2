package com.huongtlu.thuchanh_two;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView lvMonhoc;
    ArrayList<String> arr;
    Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        lvMonhoc=(ListView) findViewById(R.id.list);
        arr=new ArrayList<>();
        btnnext=(Button) findViewById(R.id.btnNext4);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListViewActivity.this, DateTimeActivity.class);
                startActivity(intent);
            }
        });
        arr.add("Lập trình android");
        arr.add("Lập trình PHP");
        arr.add("Lập trình Java");
        arr.add("Lập trình C++");
        ArrayAdapter adapter=new ArrayAdapter(ListViewActivity.this,android.R.layout.simple_list_item_1,arr);
        lvMonhoc.setAdapter(adapter);
        lvMonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"Bạn chọn môn học "+arr.get(i),Toast.LENGTH_SHORT).show();
            }

        });

    }
}
