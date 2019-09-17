package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    String text = "You have clicked the button.";
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        textview = findViewById(R.id.textview);

        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                textview.setText(text);
            }
        });
    }
}
