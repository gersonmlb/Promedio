package upeu.edu.pe.mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista{
    private Main.Presentador presentador;
    private Button button;
    private EditText edt1,edt2,edt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new FactorialPresentador(this);
        edt1 = (EditText) findViewById(R.id.txtn);
        edt2 = (EditText) findViewById(R.id.txtn2);
        edt3 = (EditText) findViewById(R.id.txtn3);


        button = (Button) findViewById(R.id.btnc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentador.calcularFactorial(edt1.getText().toString(),edt2.getText().toString(),edt3.getText().toString());
            }
        });
    }

    @Override
    public void mostrarResultado(String r) {

        int r1 = Integer.parseInt(r);


        if(r1<=20 && r1>=18) {
            Toast.makeText(getApplicationContext(), "Logro Destacado " + r, Toast.LENGTH_LONG).show();
        }else{
            if(r1>=15 ||r1>=17 ){
                Toast.makeText(getApplicationContext(), "Logro Medio "+r, Toast.LENGTH_LONG).show();
            }else{
                if(r1<=14 && r1>=12.5){
                    Toast.makeText(getApplicationContext(), "Logro Bajo "+r, Toast.LENGTH_LONG).show();
                }else{
                    if (r1<12.4){
                        Toast.makeText(getApplicationContext(), "No logrado "+r, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Notas Malas ", Toast.LENGTH_LONG).show();
                    }
                }
            }
    }
    }
}
