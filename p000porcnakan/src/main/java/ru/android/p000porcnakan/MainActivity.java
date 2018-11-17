package ru.android.p000porcnakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOK;
    Button btnChancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOK = (Button) findViewById(R.id.btnOk);
        btnChancel = (Button) findViewById(R.id.btnCancel);
        btnOK.setOnClickListener(this);
        btnChancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOk:
                tvOut.setText("sexmel ok");
                break;
            case R.id.btnCancel:
                tvOut.setText("sexmel Chanecel");
                break;
        }
    }
}