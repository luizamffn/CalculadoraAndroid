package br.edu.ifpi.helloads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MOMENTO", "...CREATE...");

        Button btn = (Button)findViewById(R.id.btn_enviar);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Por favor click simples..",Toast.LENGTH_SHORT);
                return true;
            }
        });
    }

    public void enviarClick(View v){
        EditText editMsg = (EditText)findViewById(R.id.msg);
        String msg = editMsg.getText().toString();
        editMsg.setText("");

        Intent irParaA2 = new Intent(this, calculadora.class);
        irParaA2.putExtra("MENSAGEM",msg);
        startActivity(irParaA2);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MOMENTO", "...START..");
    }
}
