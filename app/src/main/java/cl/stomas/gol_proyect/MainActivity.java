package cl.stomas.gol_proyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cl.stomas.gol_proyect.Entidades.Canchas_Model;


public class MainActivity extends AppCompatActivity {
    ImageButton btnMapa, btnFavoritos, btnNuevo;


    private RecyclerView recyclerViewCanchas;
    private RecyclerViewAdaptador adaptadorCanchas;
    private ConexionSQLiteHelper conexionSQLiteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Mostrar_Canchas();


        conexionSQLiteHelper = new ConexionSQLiteHelper(this);

        recyclerViewCanchas=findViewById(R.id.recyclerCanchas);
        //recyclerViewCanchas.setLayoutManager(new LinearLayoutManager(this));

        //ConexionSQLiteHelper conexionSQLiteHelper= new ConexionSQLiteHelper(getApplicationContext());

        //adaptadorCanchas= new RecyclerViewAdaptador(conexionSQLiteHelper.obtenerCanchas());
        //recyclerViewCanchas.setAdapter(adaptadorCanchas);


        //Click Navegation Barra inferior.
        btnMapa = (ImageButton) findViewById(R.id.btn_map);
        btnFavoritos = (ImageButton) findViewById(R.id.fav_button);
        btnNuevo = (ImageButton) findViewById(R.id.btn_nuevo);


        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Mapa", Toast.LENGTH_SHORT).show();

            }
        });

        btnFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Favoritos", Toast.LENGTH_SHORT).show();

            }
        });

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(),Nueva_Cancha.class);
                startActivity(intent);

            }
        });

        //metodo para ir al activity del mapa.
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(),Mapa.class);
                startActivity(intent);

            }
        });

    }

    /*private void Mostrar_Canchas() {
        RecyclerViewAdaptador recyclerViewAdaptador= new RecyclerViewAdaptador(MainActivity.this,
                conexionSQLiteHelper.obtenerCanchas());


        recyclerViewCanchas.setAdapter(recyclerViewAdaptador);
    }*/





    /*public List<Canchas_Modelo>  obtenerCanchas (){

        List<Canchas_Modelo> Canchass= new ArrayList<>();
        Canchass.add(new Canchas_Modelo("Cancha Callejon los palacios"," de 10 . hasta 23",R.drawable.cancha));
        Canchass.add(new Canchas_Modelo("Cancha Junquillo"," de 14 pm. hasta 20 pm",R.drawable.cancha2));
        Canchass.add(new Canchas_Modelo("Cancha Camino Trapiche"," de 10 am. hasta 20 pm",R.drawable.cancha3));

        return Canchass;
    }*/
    //Metodo para ir al siguiente activity.
    public void Ver(View view){
        Intent ver = new Intent(MainActivity.this,Activity_tres.class);
        startActivity(ver);
    }
    //Vista para ir al activity del mapa.
    public void Map(View view){
        Intent intent = new Intent(getApplicationContext(),Mapa.class);
        startActivity(intent);

    }
}