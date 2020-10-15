package cl.stomas.gol_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Filter;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class Activity_tres extends AppCompatActivity {

    FlipperLayout flipperLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        flipperLayout = findViewById(R.id.Flipper_detalles);
        int [] imageids = new int []{
                R.drawable.cancha,
                R.drawable.imagen1_01,
                R.drawable.imagen1_02,

        };
        String[] descripciones = new String[]{
            "Imagen 1",
            "Imagen 2"
        };
        //este bucle nos permitira pasar de una imagen a otra.
        for (int i=0;i<imageids.length;i++){
            FlipperView flipperView = new FlipperView(getBaseContext());
            flipperView.setImageDrawable(imageids[i]);
            //flipperView.setDescription(descripciones[i]);
            flipperLayout.addFlipperView(flipperView);

        }

    }

}