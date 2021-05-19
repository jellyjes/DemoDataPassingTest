package sg.edu.rp.c346.id20047778.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent intent = getIntent();
        int value = intent.getIntExtra("value",-1);
        char cvalue = intent.getCharExtra("value", 'z');

        tvAnswer.setText("Integer value received is " + value + "\nChar value is "+ cvalue);
    }
}