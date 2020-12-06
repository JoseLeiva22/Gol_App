package cl.stomas.gol_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Nueva_Cancha extends AppCompatActivity {


    EditText edt_id, edt_nombre, edt_direccion, edt_ciudad, edt_region, edt_contacto, edt_horario, edt_precio;
    ImageView fotos;
    Button btn_agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva__cancha);


        edt_nombre = (EditText) findViewById(R.id.EDT_NOMBRE);
        edt_direccion = (EditText) findViewById(R.id.EDT_DIRECCION);
        edt_ciudad = (EditText) findViewById(R.id.EDT_CIUDAD);
        edt_region = (EditText) findViewById(R.id.EDT_REGION);
        edt_contacto = (EditText) findViewById(R.id.EDT_CONTACTO);
        edt_horario = (EditText) findViewById(R.id.EDT_HORARIO);
        edt_precio = (EditText) findViewById(R.id.EDT_PRECIO);
        btn_agregar = (Button) findViewById(R.id.btn_registrar_cancha);


        final ConexionSQLiteHelper conexionSQLiteHelper = new ConexionSQLiteHelper(getApplicationContext());

        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conexionSQLiteHelper.Anadir_Canchas(edt_nombre.getText().toString(),
                        edt_direccion.getText().toString(),
                        edt_ciudad.getText().toString(),
                        edt_region.getText().toString(),
                        edt_contacto.getText().toString(),
                        edt_horario.getText().toString(),
                        Integer.parseInt(edt_precio.getText().toString()));
                Toast.makeText(getApplicationContext(), "Cancha agregada correctamente", Toast.LENGTH_SHORT).show();
            }
        });


    }
}