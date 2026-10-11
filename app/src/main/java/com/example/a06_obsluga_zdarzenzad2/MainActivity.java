package com.example.a06_obsluga_zdarzenzad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int licznik = 0;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button plus = findViewById(R.id.button);
        Button minus = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            licznik++;
        } else if (licznik > 0) {
            licznik--;
        } else {
            Toast.makeText(this, R.string.error_negative, Toast.LENGTH_SHORT).show();
            return;
        }

        textView2.setText(String.valueOf(licznik));
    }

    public void onResetClick(View view) {
        licznik = 0;
        textView2.setText(String.valueOf(licznik));
    }
}