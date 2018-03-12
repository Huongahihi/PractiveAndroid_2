package com.huongtlu.thuchanh_two;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class ProgressActivity extends AppCompatActivity implements View.OnClickListener {
    ProgressBar bar;
    SeekBar sec;
    Button btnb, btnd,btnnext;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        bar = (ProgressBar) findViewById(R.id.progressBar);
        sec = (SeekBar) findViewById(R.id.seekBar);
        btnb = (Button) findViewById(R.id.btnbar);
        btnd = (Button) findViewById(R.id.btndialog);
        txtview = (TextView) findViewById(R.id.txt);
        btnnext=(Button) findViewById(R.id.btnNext6);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProgressActivity.this,ListViewNCActivity.class);
                startActivity(intent);
            }
        });
        btnb.setOnClickListener(this);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressDialog();
            }
        });
        sec.setOnSeekBarChangeListener(new
                                               SeekBar.OnSeekBarChangeListener() {
                                                   @Override
                                                   public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                                                       txtview.setText(i + "");
                                                   }

                                                   @Override
                                                   public void onStartTrackingTouch(SeekBar seekBar) {
                                                   }

                                                   @Override
                                                   public void onStopTrackingTouch(SeekBar seekBar) {
                                                   }
                                               });
    }

    public void showProgressDialog() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("File Downloading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog = ProgressDialog.show(this, "Downloading", "Please wait", true);

    }

    @Override
    public void onClick(View view) {
        //Tạo một coundown để xử lý chạy thanh
        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                int currun = bar.getProgress();
//                        Chạy đến hết luồng -max, nó sẽ quay lại từ đầu luồng và tiếp tục.
                if (currun >= bar.getMax()) {
                    currun = 0;
                }
                bar.setProgress(currun + 10);
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();

    }
}
