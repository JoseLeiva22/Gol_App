package cl.stomas.gol_proyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cl.stomas.gol_proyect.Entidades.Canchas_Model;
import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class Activity_tres extends AppCompatActivity {

    private TextView tv_id, tv_nombre, tv_direccion, tv_ciudad, tv_region, tv_contacto, tv_horario, tv_precio;

    private RecyclerViewAdaptador recyclerViewAdaptador;
    private ConexionSQLiteHelper conexionSQLiteHelper;
    FlipperLayout flipperLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        conexionSQLiteHelper = new ConexionSQLiteHelper(this);
        tv_id = findViewById(R.id.TV_ID);
        tv_nombre = findViewById(R.id.TV_nombre);
        tv_direccion = findViewById(R.id.TV_direccion);
        tv_ciudad = findViewById(R.id.TV_ciudad);
        tv_region = findViewById(R.id.TV_region);
        tv_contacto = findViewById(R.id.TV_contacto);
        tv_horario = findViewById(R.id.TV_horario);
        tv_precio = findViewById(R.id.TV_precio);

        //Mostrar_Detalles();


        flipperLayout = findViewById(R.id.Flipper_detalles);
        int[] imageids = new int[]{
                R.drawable.cancha,
                R.drawable.imagen1_01,
                R.drawable.imagen1_02,

        };

        String[] descripciones = new String[]{
                "Imagen 1",
                "Imagen 2"
        };
        //este bucle nos permitira pasar de una imagen a otra.
        for (int i = 0; i < imageids.length; i++) {
            FlipperView flipperView = new FlipperView(getBaseContext());
            flipperView.setImageDrawable(imageids[i]);
            flipperView.setDescription(descripciones[i]);
            flipperLayout.addFlipperView(flipperView);

        }

    }

    private void Mostrar_Detalles() {

        String selectQuery = "Select * from CREATE_TABLA_CANCHAS";
        SQLiteDatabase bd = conexionSQLiteHelper.getWritableDatabase();
        Cursor cursor = ((SQLiteDatabase) bd).rawQuery(selectQuery, null);

        while (cursor.moveToNext()) {
            Canchas_Model canchas_model = new Canchas_Model();
            canchas_model.setId_cancha(cursor.getInt(0));
            canchas_model.setNombre_can(cursor.getString(1));
            canchas_model.setDirecion(cursor.getString(2));
            canchas_model.setCiudad(cursor.getString(3));
            canchas_model.setRegion(cursor.getString(4));
            canchas_model.setContacto(cursor.getString(5));
            canchas_model.setHorario(cursor.getString(6));
            canchas_model.setPrecio(cursor.getInt(7));
            canchas_model.setImagen(cursor.getInt(8));
            canchas_model.add(canchas_model);
        }

    }

}

