package kr.hs.emirim.s2019s11.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnGo;
    RadioButton radioPlus, radioMin, radioMulti, radioDiv;

    String num1, num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit_num1);
        edit2 = findViewById(R.id.edit_num2);
        btnGo = findViewById(R.id.btn_go);
        radioPlus = findViewById(R.id.radio_plus);
        radioMin = findViewById(R.id.radio_min);
        radioMulti = findViewById(R.id.radio_multi);
        radioDiv = findViewById(R.id.radio_div);

        btnGo.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("num1", num1);
            intent.putExtra("num2", num2);
            startActivity(intent);
        }
    };
}