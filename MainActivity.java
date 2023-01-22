package com.example.baseconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText numberEditText;
    EditText currentBaseEditText;
    EditText desiredBaseEditText;
    TextView convertedNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEditText = (EditText) findViewById(R.id.numberEditText);
        currentBaseEditText = (EditText) findViewById(R.id.currentBaseEditText);
        desiredBaseEditText = (EditText) findViewById(R.id.desiredBaseEditText);
        convertedNumberTextView = (TextView) findViewById(R.id.convertedNumberTextView);
    }

    public void convertNumber(View view) {
        String number = numberEditText.getText().toString();
        int currentBase = Integer.parseInt(currentBaseEditText.getText().toString());
        int desiredBase = Integer.parseInt(desiredBaseEditText.getText().toString());

        String convertedNumber = Integer.toString(Integer.parseInt(number, currentBase), desiredBase);

        convertedNumberTextView.setText("Converted number: " + convertedNumber);
    }
}
