package br.com.fiap.exercicioprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ovo;
    CheckBox bacon;
    CheckBox hmbg;
    RadioGroup lanches;
    Double conta = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ovo = findViewById(R.id.ovo);
        bacon = findViewById(R.id.bacon);
        hmbg = findViewById(R.id.hmbg);

        lanches = findViewById(R.id.lanches);
    }

    public void realizarPedido(View view){

        int posicao = lanches.getCheckedRadioButtonId();
        RadioButton pedido = findViewById(posicao);

        if (pedido != null){
                if(pedido.getText() == getString(R.string.hamburguer1)){
                    conta = conta + 24.90;
                }

                if(pedido.getText() == getString(R.string.hamburguer2)){
                    conta = conta + 28.70;
                }

                if(pedido.getText() == getString(R.string.hamburguer3)){
                    conta = conta + 34.90;
                }

            if(ovo.isChecked()){
                conta = conta + 2.50;
            }
            if(bacon.isChecked()){
                conta = conta + 3.50;
            }
            if(hmbg.isChecked()){
                conta = conta + 8;
            }
            Toast.makeText(this, "Pedido realizado com sucesso. Lanche: " + pedido.getText() +" Valor: R$" + conta, Toast.LENGTH_SHORT).show();
            conta = 0.0;
        } else {
            Toast.makeText(this, getString(R.string.invalidRequest), Toast.LENGTH_SHORT).show();
        }

    }


}
