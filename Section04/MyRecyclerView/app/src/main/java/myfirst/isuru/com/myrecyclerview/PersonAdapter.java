package myfirst.isuru.com.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<Person> people;

    public PersonAdapter(Context context, ArrayList<Person> list){
        people=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPref;
        TextView tvName,tvSurname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPref=itemView.findViewById(R.id.ivPref);
            tvName=itemView.findViewById(R.id.tvName);
            tvSurname=itemView.findViewById(R.id.tvSurname);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int i) {
        holder.itemView.setTag(people.get(i));
        holder.tvName.setText(people.get(i).getName());
        holder.tvSurname.setText(people.get(i).getSurname());

        if (people.get(i).getPreference().equals("bus")){
            holder.ivPref.setImageResource(R.drawable.bus);
        }else {
            holder.ivPref.setImageResource(R.drawable.plane);
        }
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
