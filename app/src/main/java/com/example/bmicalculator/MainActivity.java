package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText bw,bh;
    private TextView br;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bw = (EditText)findViewById(R.id.bw_weight);
        bh = (EditText)findViewById(R.id.bh_height);
        br = (TextView)findViewById(R.id.br_result);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bmi();

            }
        });
    }
    private void bmi(){
        float w, h, r;
        w = Float.parseFloat(bw.getText().toString());
        h = Float.parseFloat(bh.getText().toString());
        r = w / (h * h);
        br.setText("Result: " + r);

        if (r <= 18.5) {
            Toast.makeText(getApplicationContext(),"You are UnderWeight", Toast.LENGTH_SHORT).show();
        }
        if ((r >= 18.5) && (r < 24.9)) {
            Toast.makeText(getApplicationContext(), "You are Normal", Toast.LENGTH_SHORT).show();
        }
        if (r >= 25) {
            Toast.makeText(getApplicationContext(), "You are OverWeight", Toast.LENGTH_SHORT).show();
        }
    }
}
