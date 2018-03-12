package com.huongtlu.thuchanh_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton r1;
    RadioButton r2;
    RadioGroup g;
    Button btnclick,btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        r1=(RadioButton) findViewById(R.id.a);
        r2=(RadioButton) findViewById(R.id.aa);
        g=(RadioGroup) findViewById(R.id.hi);
        btnclick=(Button) findViewById(R.id.btnpay2);
        btnnext=(Button) findViewById(R.id.btnNext2);
        btnnext.setOnClickListener(this);
        btnclick.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int idChecek=g.getCheckedRadioButtonId();
        switch (idChecek){
            case R.id.a:
                Toast.makeText(this,"Coffe&" +r1.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.aa:
                Toast.makeText(this,"Coffe&"+r2.getText(),Toast.LENGTH_SHORT).show();
                break;
        }
        if(view.getId()==R.id.btnNext2){
            Intent intent=new Intent(this,SpninerActivity.class);
            startActivity(intent);
        }
    }
}
