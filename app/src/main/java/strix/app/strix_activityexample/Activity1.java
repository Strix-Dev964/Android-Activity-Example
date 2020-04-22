package strix.app.strix_activityexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

/* Created by Strix - http://strixdev.co.uk */

public class Activity1 extends AppCompatActivity {

    Button button;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        CreateButtonListener();
    }

    public void CreateButtonListener() {

        context = this;
        button = findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Activity2.class);
                startActivity(intent);

            }

        });

    }

}