package com.jake.chyna.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et;
    ImageButton btn;
    ListView lv;
    boolean bot;

    String [] random = {"Thank me", "It is such a quite thing, to fall, but far more terrible is to admit it",
        "Check your elbows", "U R magnificently attractive today", "UOU", "Bazinga"};
    Random r = new Random();
    int randomInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        et = (EditText) findViewById(R.id.et);
        lv = (ListView) findViewById(R.id.lv);
        btn = (ImageButton) findViewById(R.id.btn);


        lv.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        lv.setStackFromBottom(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bot) {
                    randomInt = r.nextInt(6);

                }
            }
        });

    }
}
