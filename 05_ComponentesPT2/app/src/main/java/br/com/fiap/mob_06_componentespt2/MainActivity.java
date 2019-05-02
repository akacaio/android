package br.com.fiap.mob_06_componentespt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox selectBox;
    RadioGroup rdgTimes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectBox = findViewById(R.id.selectBox);
        rdgTimes = findViewById(R.id.rdgTimes);

    }

    public void check(View view) {

        /*if(selectBox.isChecked()){
            Toast.makeText(this, R.string.checkboxselected, Toast.LENGTH_SHORT).show();
        }*/

        int position = rdgTimes.getCheckedRadioButtonId();
        RadioButton rb = findViewById(position);

        if(rb != null){
            Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.noteam, Toast.LENGTH_SHORT).show();
        }

    }
}
