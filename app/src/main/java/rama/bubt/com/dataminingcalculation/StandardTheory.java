package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

/**
 * Created by Dipangker on 12/26/2015.
 */
public class StandardTheory extends Fragment {

private TextView tv1,tv2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.standard_theory, container,false);

        tv1=(TextView) view.findViewById(R.id.tvAnswer);
        tv2=(TextView) view.findViewById(R.id.part2);

        tv1.setText(getResources().getString(R.string.standard_deviation_theory_1));
        tv2.setText(getResources().getString(R.string.standard_deviation_theory_2));

        return view;
    }
}