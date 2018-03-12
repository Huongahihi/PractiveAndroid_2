package com.huongtlu.thuchanh_two;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ck1, ck2;
    Button btnpay,btnnext;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        ck1 = (CheckBox) findViewById(R.id.checkBox);
        ck2 = (CheckBox) findViewById(R.id.checkBox2);
        btnpay=(Button) findViewById(R.id.btnpay);
        btnnext=(Button) findViewById(R.id.btnNext);
        btnpay.setOnClickListener(this);
        btnnext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if (ck1.isChecked() &&ck2.isChecked()) {

            Toast.makeText(CheckActivity.this, "Coffe &" + ck1.getText()+"," +ck2.getText(), Toast.LENGTH_SHORT).show();
        }
        if (ck2.isChecked()) {
            Toast.makeText(CheckActivity.this, "Coffe &" + ck2.getText(), Toast.LENGTH_SHORT).show();
        }
        if (ck1.isChecked()) {
            Toast.makeText(CheckActivity.this, "Coffe &" + ck1.getText(), Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.btnYes){
            new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    CheckActivity.this.finish();
                }
            };
        }
        if(id==R.id.btnNext){
            Intent intent=new Intent(this,RadioActivity.class);
            startActivity(intent);
        }
        ck1.setChecked(true);
        ck1.setChecked(false);
        showDialog();
    }
    public  void showDialog(){
        dialog=new Dialog(CheckActivity.this);
        dialog.setTitle("Are you sure to exit?");
        dialog.setContentView(R.layout.dialog);

        dialog.show();
    }
}

//   final AlertDialog.Builder builder=new AlertDialog.Builder(this);


