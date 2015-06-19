package pika.de.wwpointswizard2.gui;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import pika.de.wwpointswizard2.R;
import pika.de.wwpointswizard2.services.DishService;
import pika.de.wwpointswizard2.services.impl.DishServiceImpl;


/**
 * A simple {@link Fragment} subclass.
 */
public class DishFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private DishService dishService = new DishServiceImpl();


    public DishFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dish, container, false);
        Spinner portionUnitSpinner = getPortionUnitSpinner(view);
        portionUnitSpinner.setOnItemSelectedListener(this);
        portionUnitSpinner.setPrompt("select unit");
        portionUnitSpinner.setAdapter(getSpinnerItemAdapter());
        return view;
    }

    private Spinner getPortionUnitSpinner(View view) {
        return (Spinner) (view.findViewById(R.id.spinPortionUnit));
    }

    private ArrayAdapter<String> getSpinnerItemAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this.getActivity(),
                android.R.layout.simple_spinner_item,
                dishService.getPortionShortnames());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
