package br.com.fiap.mob_03_jogodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imgPessoa1;
    ImageView imgPessoa2;
    ImageView imgDado1;
    ImageView imgDado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa1 = findViewById(R.id.imgPessoa1);
        imgPessoa2 = findViewById(R.id.imgPessoa2);
        imgDado1 = findViewById(R.id.imgDado1);
        imgDado2 = findViewById(R.id.imgDado2);

    }

    public void sortearDados(View view){

        int d1 = 0;
        int d2 = 0;
        int dadoP1 = (int) Math.floor(Math.random() * 6) + 1;
        int dadoP2 = (int) Math.floor(Math.random() * 6) + 1;

        switch(dadoP1) {
            case 1:
                imgDado1.setImageResource(R.drawable.d1);
                d1 = 1;
                break;
            case 2:
                imgDado1.setImageResource(R.drawable.d2);
                d1 = 2;
                break;
            case 3:
                imgDado1.setImageResource(R.drawable.d3);
                d1 = 3;
                break;
            case 4:
                imgDado1.setImageResource(R.drawable.d4);
                d1 = 4;
                break;
            case 5:
                imgDado1.setImageResource(R.drawable.d5);
                d1 = 5;
                break;
            case 6:
                imgDado1.setImageResource(R.drawable.d6);
                d1 = 6;
                break;
        }

            switch(dadoP2){
                case 1:
                    imgDado2.setImageResource(R.drawable.d1);
                    d2 = 1;
                    break;
                case 2:
                    imgDado2.setImageResource(R.drawable.d2);
                    d2 = 2;
                    break;
                case 3:
                    imgDado2.setImageResource(R.drawable.d3);
                    d2 = 3;
                    break;
                case 4:
                    imgDado2.setImageResource(R.drawable.d4);
                    d2 = 4;
                    break;
                case 5:
                    imgDado2.setImageResource(R.drawable.d5);
                    d2 = 5;
                    break;
                case 6:
                    imgDado2.setImageResource(R.drawable.d6);
                    d2 = 6;
                    break;
        }

        if(d1 > d2) {
            Toast.makeText(this, "Jogador 1 é o vencedor!", Toast.LENGTH_SHORT).show();
        } else if (d2 > d1){
            Toast.makeText(this, "Jogador 2 é o vencedor!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Empate!", Toast.LENGTH_SHORT).show();
        }

    }



}
