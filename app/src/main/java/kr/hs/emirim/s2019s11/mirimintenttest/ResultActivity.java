package kr.hs.emirim.s2019s11.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String op = intent.getStringExtra("op");
        TextView textResult = findViewById(R.id.text_result);

        int input1 = Integer.parseInt(intent.getStringExtra("num1"));
        int input2 = Integer.parseInt(intent.getStringExtra("num2"));

        switch (op) {
            case "+":
                textResult.setText(input1 + "+" + input2 + "=" + (input1+input2));
                break;
            case "-":
                textResult.setText(input1 + "-" + input2 + "=" + (input1-input2));
                break;
            case "*":
                textResult.setText(input1 + "*" + input2 + "=" + (input1*input2));
                break;
            case "/":
                textResult.setText(input1 + "/" + input2 + "=" + (input1/input2));
                break;
        }

        Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}