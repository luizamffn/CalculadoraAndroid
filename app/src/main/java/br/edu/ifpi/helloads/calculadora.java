package br.edu.ifpi.helloads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        String msg = getIntent().getStringExtra("MENSAGEM");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void calcular(View v){
        double resultado = 0;

        EditText edNum1 = (EditText) findViewById(R.id.num1);
        EditText edNum2 = (EditText) findViewById(R.id.num2);

        double num1 = Double.valueOf(edNum1.getText().toString());
        double num2 = Double.valueOf(edNum2.getText().toString());

        RadioGroup group = (RadioGroup) findViewById(R.id.operacoes);

        switch (group.getCheckedRadioButtonId()){
            case(R.id.soma):
                resultado = num1 + num2;
            case(R.id.subtracao):
                resultado = num1 - num2;
            case(R.id.multiplicaccao):
                resultado = num1 * num2;
            case(R.id.divisao):
                resultado = num1 / num2;
        }

        Toast.makeText(this, "O resultado é "+resultado,Toast.LENGTH_SHORT).show();
//        TextView textView = (TextView) findViewById(R.id.resultado);
//        textView.setText("Resultado");


    }
}
