package pika.de.wwpointswizard2.gui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pika.de.wwpointswizard2.R;
import pika.de.wwpointswizard2.core.wwpoints.Points;
import pika.de.wwpointswizard2.core.wwpoints.WWPointType;
import pika.de.wwpointswizard2.core.wwpoints.simple.point.QuarterRounder;
import pika.de.wwpointswizard2.services.SimplePointCalculation;
import pika.de.wwpointswizard2.services.impl.SimplePointCalculationImpl;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private SimplePointCalculation simplePointCalculation = new SimplePointCalculationImpl();

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        WWPointType.setPointRounder(new QuarterRounder());
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        final Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatePoints(v);
            }
        });
        return view;
    }

    public void calculatePoints(View view) {
        EditText kcal = (EditText) getActivity().findViewById(R.id.editText);
        double kcalVal = Double.parseDouble(kcal.getText().toString());
        EditText fat = (EditText) getActivity().findViewById(R.id.editText2);
        double fatVal = Double.parseDouble(fat.getText().toString());
        TextView points = (TextView) getActivity().findViewById(R.id.textView4);
        Points calcPoints = simplePointCalculation.calcSimplePoints(kcalVal, fatVal);
        points.setText(Double.toString(calcPoints.calculatePoints().getPointValue()));
    }

}
