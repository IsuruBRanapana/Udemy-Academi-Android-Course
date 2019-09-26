package com.android.contact2018;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContactAdapter extends ArrayAdapter<Contacts> {
    private Context context;
    private List<Contacts> contacts;


    public ContactAdapter(Context context, List<Contacts> list){
        super(context,R.layout.row_layout,list);
        this.context=context;
        this.contacts=list;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.row_layout,parent,false);
        TextView tvLetter= convertView.findViewById(R.id.tvLetter);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvEmail= convertView.findViewById(R.id.tvEmail);

        tvLetter.setText(contacts.get(position).getName().toUpperCase().charAt(0)+"");
        tvName.setText(contacts.get(position).getName());
        tvEmail.setText(contacts.get(position).getEmail());

        return convertView;
    }

}
