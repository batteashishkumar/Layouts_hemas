package com.example.layouts_hemas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_recycler extends RecyclerView.Adapter<Adapter_recycler.Holder> {
    private List<Cell> listitems;
    Context context;
public Adapter_recycler(List<Cell> listitems, Context context)
{
    this.listitems = listitems;
    this.context = context;

}
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_recyclerview, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.routecode.setText(listitems.get(i).getRoutecode());
        holder.number_outlets_delivered.setText(""+String.valueOf(listitems.get(i).getOutlets_delivered()));
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView routecode;
        TextView number_outlets_delivered;

        public Holder(View itemView) {
            super(itemView);
            routecode=itemView.findViewById(R.id.Routecode);
            number_outlets_delivered=itemView.findViewById(R.id.number_outlets_delivered);
        }
    }
}
