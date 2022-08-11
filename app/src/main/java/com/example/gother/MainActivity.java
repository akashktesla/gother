package com.example.gother;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Welcome to Gother", Toast.LENGTH_LONG).show();
        Log.d("_log","oncreate");
        Button btn1;
        Button btn4;
        Button btn5;
        btn1 = findViewById(R.id.btn1);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String count = btn4.getText().toString();
                Integer temp = Integer.valueOf(count);
                temp = temp+1;
                count = Integer.toString(temp);
                btn4.setText(count);
            }
        });

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Button btn4;
        btn4 = findViewById(R.id.btn4);
        outState.putInt("counter",Integer.valueOf(btn4.getText().toString()));

    }
}