package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class RunActivity extends AppCompatActivity {

    private CheckBox checkBox1;
    private Button btn_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox_first);

        checkBox1.setOnCheckedChangeListener(checkBoxOnCheckedChange);

        btn_finish = (Button) findViewById(R.id.run_finish);
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    private CompoundButton.OnCheckedChangeListener checkBoxOnCheckedChange =
            new CompoundButton.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                {
                    if(checkBox1.isChecked()) {
                        btn_finish.setVisibility(View.VISIBLE);
                    }
                    else {
                        btn_finish.setVisibility(View.INVISIBLE);
                    }
                }
            };

}