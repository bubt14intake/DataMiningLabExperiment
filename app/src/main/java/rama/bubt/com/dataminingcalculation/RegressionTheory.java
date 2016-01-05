package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dipangker on 12/27/2015.
 */
public class RegressionTheory extends Fragment{

    private TextView tv1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.regression_theory, container,false);

        tv1=(TextView) view.findViewById(R.id.regressiontheory);


        tv1.setText(getResources().getString(R.string.regression_part_one));

        return view;
    }
}