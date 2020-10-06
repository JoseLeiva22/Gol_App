package cl.stomas.gol_proyect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>
{
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView nombre,horario;
        ImageView imgCancha;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.tvnombre);
            horario=(TextView)itemView.findViewById(R.id.tvhorario);
            imgCancha= (ImageView) itemView.findViewById(R.id.tvcancha);

        }
    }

    public List<CanchasModelo>ListaCanchas;

    public RecyclerViewAdaptador(List<CanchasModelo> listaCanchas) {
        ListaCanchas = listaCanchas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutcanchas,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(ListaCanchas.get(position).getNombre());
        holder.horario.setText(ListaCanchas.get(position).getHorario());
        holder.imgCancha.setImageResource(ListaCanchas.get(position).getImgCancha());
    }

    @Override
    public int getItemCount() {
        return ListaCanchas.size();
    }
}
