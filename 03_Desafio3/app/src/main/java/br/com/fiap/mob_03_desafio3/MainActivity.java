package br.com.fiap.mob_03_desafio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;

    private boolean check = false;

    int[] imgs = {
            R.drawable.p1,
            R.drawable.p2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
    }

    public void inverter(View view) {

        if(check == false) {
            img1.setImageResource(imgs[0]);
            img2.setImageResource(imgs[1]);
            check = true;
        } else {
            img1.setImageResource(imgs[1]);
            img2.setImageResource(imgs[0]);
            check = false;
        }
    }
}