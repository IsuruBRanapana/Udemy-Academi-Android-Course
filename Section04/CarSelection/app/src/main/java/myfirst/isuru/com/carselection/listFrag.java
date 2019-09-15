package myfirst.isuru.com.carselection;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class listFrag extends Fragment {


    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager myLayoutManger;
    View view;
    public listFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView=view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        myLayoutManger =new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(myLayoutManger);

        myAdapter=new CarAdapter(this.getActivity(),ApplicationClass.cars);
        recyclerView.setAdapter(myAdapter);


    }
}
