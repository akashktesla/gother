package com.example.gother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onstart",Toast.LENGTH_LONG).show();
        Log.d("_log","onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onpause",Toast.LENGTH_LONG).show();
        Log.d("_log","onpause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onresume",Toast.LENGTH_LONG).show();
        Log.d("_log","onresume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onstop",Toast.LENGTH_LONG).show();
        Log.d("_log","onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onrestart",Toast.LENGTH_LONG).show();
        Log.d("_log","onrestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"ondestroy",Toast.LENGTH_LONG).show();
        Log.d("_log","onDestroy");
    }
}
