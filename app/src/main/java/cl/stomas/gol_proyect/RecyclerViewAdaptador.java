package cl.stomas.gol_proyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cl.stomas.gol_proyect.Entidades.Canchas_Model;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.Vista_Canchas>{


    private  Context context;
    private ArrayList<Canchas_Model>canchasModels;

    Button ver;

    public RecyclerViewAdaptador(Context context,ArrayList<Canchas_Model> canchasModels) {
        this.context = context;
        this.canchasModels= canchasModels;

    }

    @NonNull
    @Override
    public Vista_Canchas onCreateViewHolder( ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);
        return new Vista_Canchas(view);



    }

    @Override
    public void onBindViewHolder( Vista_Canchas vista_canchas, int position) {
        Canchas_Model canchas_model= canchasModels.get(position);
        vista_canchas.id_cancha.setText(canchas_model.getId_cancha());
        vista_canchas.tv__nombre.setText(canchas_model.getNombre_can());
        vista_canchas.tv__direccion.setText(canchas_model.getDirecion());
        vista_canchas.tv__ciudad.setText(canchas_model.getCiudad());
        vista_canchas.tv__region.setText(canchas_model.getRegion());
        vista_canchas.tv__horario.setText(canchas_model.getHorario());
        vista_canchas.tv__precio.setText(canchas_model.getPrecio());

    }

    @Override
    public int getItemCount() {
        return canchasModels.size();
    }



    public class Vista_Canchas extends RecyclerView.ViewHolder{
        private TextView id_cancha, tv__nombre, tv__direccion, tv__ciudad, tv__region, tv__contacto, tv__horario, tv__precio;
        private ImageView foto;
        public Vista_Canchas(@NonNull View itemView) {
            super(itemView);

            id_cancha = itemView.findViewById(R.id.ID_);
            tv__nombre = itemView.findViewById(R.id.tvnombre);
            tv__horario = itemView.findViewById(R.id.tvhorario);
            foto = itemView.findViewById(R.id.tvcancha);
        }
    }


}
