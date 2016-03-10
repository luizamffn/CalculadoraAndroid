package br.edu.ifpi.helloads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String msg = getIntent().getStringExtra("MENSAGEM");

        //Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        TextView textView = new TextView(this);
        textView.setText(msg);
        textView.setTextSize(40);

        RelativeLayout rl = (RelativeLayout)findViewById(R.id.tela2);
        rl.addView(textView);
    }
}
