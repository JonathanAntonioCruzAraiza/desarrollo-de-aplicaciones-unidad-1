package mx.edu.utng.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private Button btnCrear;
    private Button btnEliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre=(EditText) findViewById(R.id.edit_name);
        btnCrear= (Button) findViewById(R.id.btn_crear);


        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Universidad uni =  Universidad.getUnicaInstancia();
                uni.setNombre(edtNombre.getText().toString());

                Toast.makeText(MainActivity.this,"creado"+uni.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
