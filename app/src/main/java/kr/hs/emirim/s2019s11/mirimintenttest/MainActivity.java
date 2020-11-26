package kr.hs.emirim.s2019s11.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnGo;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit_num1);
        edit2 = findViewById(R.id.edit_num2);
        btnGo = findViewById(R.id.btn_go);
        rg = findViewById(R.id.rg);

        btnGo.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            intent.putExtra("num1", edit1.getText().toString());
            intent.putExtra("num2", edit2.getText().toString());

            String op = "";

            switch (rg.getCheckedRadioButtonId()) {
                case R.id.radio_plus:
                    op = "+";
                    break;
                case R.id.radio_min:
                    op = "-";
                    break;
                case R.id.radio_multi:
                    op = "*";
                    break;
                case R.id.radio_div:
                    op = "/";
                    break;
            }

            intent.putExtra("op", op);
            startActivity(intent);
        }
    };
}