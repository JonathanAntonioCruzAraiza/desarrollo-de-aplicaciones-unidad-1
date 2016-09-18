package mx.edu.utng.prototypeexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtModelo;
    private EditText edtMarca;
    private EditText edtCompañia;
    private Button btnClonar;
    private GridView grvCelular;
    private ArrayList<Celular> celulars;
    private Celular celular;
    private CelularAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCompañia=(EditText)findViewById(R.id.edt_Compañia);
        edtMarca=(EditText)findViewById(R.id.edt_Marca);
        edtModelo=(EditText)findViewById(R.id.edt_Modelo);
        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvCelular=(GridView)findViewById(R.id.grv_celolar);
        celulars = new ArrayList<Celular>();
        celular=new Celular();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celular.setModelo(edtModelo.getText().toString());
                celular.setMarca(edtMarca.getText().toString());
                celular.setCompañia(edtCompañia.getText().toString());

                Celular clon = (Celular) celular.clonar();

                celulars.add(clon);
                adapter = new CelularAdapter(MainActivity.this,(ArrayList)celulars);
                grvCelular.setAdapter(adapter);
            }
        });

    }
}
