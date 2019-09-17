package myfirst.isuru.com.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter {

    private final Context context;
    private final ArrayList<Products> products;

    public ListAdapter(@NonNull Context context, ArrayList<Products> list) {
        super(context, R.layout.custom_list_layout,list);
        this.context = context;
        this.products = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.custom_list_layout,parent,false);

        TextView tvProduct=(TextView) view.findViewById(R.id.tvProduct);
        TextView tvPrice=(TextView) view.findViewById(R.id.tvPrice);
        TextView tvDescription=(TextView) view.findViewById(R.id.tvDescription);

        ImageView ivProduct=(ImageView) view.findViewById(R.id.ivProduct);
        ImageView ivSale=(ImageView) view.findViewById(R.id.ivSale);

        tvProduct.setText(products.get(position).getTitle());
        tvPrice.setText("R"+products.get(position).getPrice());
        tvDescription.setText(products.get(position).getDescription());

        if (products.get(position).getSale()){
            ivSale.setImageResource(R.mipmap.on_sale_big);
        }else
            ivSale.setImageResource(R.mipmap.best_price);

        if (products.get(position).getType().equals("Laptop")){
            ivProduct.setImageResource(R.mipmap.laptop);
        }else if (products.get(position).getType().equals("Memory")){
            ivProduct.setImageResource(R.mipmap.memory);
        }else if (products.get(position).getType().equals("HDD")){
            ivProduct.setImageResource(R.mipmap.hdd);
        }else
            ivProduct.setImageResource(R.mipmap.screen);

        return view;
    }
}
