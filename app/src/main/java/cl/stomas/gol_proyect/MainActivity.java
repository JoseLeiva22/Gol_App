package cl.stomas.gol_proyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ImageView imagenUno, imagenDos, imagenTres;

    private RecyclerView recyclerViewCanchas;
    private RecyclerViewAdaptador adaptadorCanchas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCanchas=(RecyclerView)findViewById(R.id.recyclerCanchas);
        recyclerViewCanchas.setLayoutManager((new LinearLayoutManager(this)));

        adaptadorCanchas= new RecyclerViewAdaptador(obtenerCanchas());
        recyclerViewCanchas.setAdapter(adaptadorCanchas);
    }

    public List<CanchasModelo> obtenerCanchas(){

        List<CanchasModelo> Canchass= new ArrayList<>();
        Canchass.add(new CanchasModelo("Cancha Callejon los palacios"," de 10 am. hasta 23 pm",R.drawable.cancha));
        Canchass.add(new CanchasModelo("Cancha Junquillo"," de 14 pm. hasta 20 pm",R.drawable.cancha2));
        Canchass.add(new CanchasModelo("Cancha Camino Trapiche"," de 10 am. hasta 20 pm",R.drawable.cancha3));

        return Canchass;
    }
    public void Ver(View view){
        Intent ver = new Intent(this,Activity_dos.class);
        startActivity(ver);
    }
}