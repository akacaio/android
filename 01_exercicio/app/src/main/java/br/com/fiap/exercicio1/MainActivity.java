package br.com.fiap.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNum;
    EditText secNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNum);
        secNum = findViewById(R.id.secNum);
    }

    public void calc(View view){
        Double conta = Double.parseDouble(firstNum.getText().toString()) + Double.parseDouble(secNum.getText().toString());
        Toast.makeText(this,"A soma dos número é: " + conta,Toast.LENGTH_SHORT).show();
    }
}
