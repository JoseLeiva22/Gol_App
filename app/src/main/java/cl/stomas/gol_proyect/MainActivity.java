package cl.stomas.gol_proyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ImageButton imagenA, imagenB;

    private RecyclerView recyclerViewCanchas;
    private RecyclerViewAdaptador adaptadorCanchas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Click Navegation Barra inferior.
        imagenA = (ImageButton) findViewById(R.id.mapa_button);
        imagenB = (ImageButton) findViewById(R.id.fav_button);

        imagenA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Mapa", Toast.LENGTH_SHORT).show();

            }
        });

        imagenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Favoritos", Toast.LENGTH_SHORT).show();

            }
        });

        recyclerViewCanchas=(RecyclerView)findViewById(R.id.recyclerCanchas);
        recyclerViewCanchas.setLayoutManager((new LinearLayoutManager(this)));

        adaptadorCanchas= new RecyclerViewAdaptador(obtenerCanchas());
        recyclerViewCanchas.setAdapter(adaptadorCanchas);


    }

    public List<Canchas_Modelo> obtenerCanchas(){

        List<Canchas_Modelo> Canchass= new ArrayList<>();
        Canchass.add(new Canchas_Modelo("Cancha Callejon los palacios"," de 10 am. hasta 23 pm",R.drawable.cancha));
        Canchass.add(new Canchas_Modelo("Cancha Junquillo"," de 14 pm. hasta 20 pm",R.drawable.cancha2));
        Canchass.add(new Canchas_Modelo("Cancha Camino Trapiche"," de 10 am. hasta 20 pm",R.drawable.cancha3));

        return Canchass;
    }
    //Metodo para ir al siguiente activity.
    public void Ver(View view){
        Intent ver = new Intent(this,Activity_tres.class);
        startActivity(ver);
    }
}