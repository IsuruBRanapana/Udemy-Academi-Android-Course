package myfirst.isuru.com.carselection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    ArrayList<Car> cars;

    public CarAdapter(Context context,ArrayList<Car> list) {
        cars=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivMake;
        TextView tvModel,tvOwnerName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMake=itemView.findViewById(R.id.ivMake);
            tvModel=itemView.findViewById(R.id.tvModel);
            tvOwnerName=itemView.findViewById(R.id.tvOwnerName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(cars.get(position));
        holder.tvOwnerName.setText(cars.get(position).getOwnerName());
        holder.tvModel.setText(cars.get(position).getModel());
        if (cars.get(position).getMake().equals("Volkswagen")){
            holder.ivMake.setImageResource(R.drawable.volkswagen);
        }else if (cars.get(position).getMake().equals("Nissan")){
            holder.ivMake.setImageResource(R.drawable.nissan);
        }else {
            holder.ivMake.setImageResource(R.drawable.mercedes);
        }
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
