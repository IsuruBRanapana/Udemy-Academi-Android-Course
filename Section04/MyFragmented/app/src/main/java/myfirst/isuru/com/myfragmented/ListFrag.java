package myfirst.isuru.com.myfragmented;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFrag extends ListFragment {

    ItemSelected activity;
    public interface ItemSelected{
        void onItemSelected(int index);
    }


    public ListFrag() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(ItemSelected) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<String> data=new ArrayList<>();
        data.add("1. Item 1");
        data.add("2. Item 2");
        data.add("3. Item 3");

        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, data));
        activity.onItemSelected(0);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        activity.onItemSelected(position);
    }
}
