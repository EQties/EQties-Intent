package com.example.isabel.application3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button Act1button= (Button) findViewById(R.id.Act1button);
        Act1button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent= new Intent(v.getContext(), Second.class);
                        startActivity(myIntent);
                    }
                }
        );

    }

}
