package br.com.fiap.mob_03_desafio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {

    EditText palavra;
    public String str;
    public String aux;
    public String strTratada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palavra = findViewById(R.id.palavra);
    }

    public void palindrome(View view){

        str = palavra.getText().toString().toLowerCase().replaceAll(" ","");
        strTratada = Normalizer.normalize(str, Normalizer.Form.NFD);
        strTratada = strTratada.replaceAll("[^\\p{ASCII}]","");
        aux = new StringBuffer(strTratada).reverse().toString();

        if (strTratada.equals(aux)) {
            Toast.makeText(this, "Palavra é palíndrome! -> " +strTratada, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Palavra não é palíndrome! -> " +strTratada, Toast.LENGTH_SHORT).show();
        }

    }
}
