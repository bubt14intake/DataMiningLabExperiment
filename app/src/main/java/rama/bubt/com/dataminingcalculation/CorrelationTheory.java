package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dipangker on 12/26/2015.
 */
public class CorrelationTheory extends Fragment {

   private  TextView tv1,tv2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.correlation_theory,container,false);



        tv1=(TextView) v.findViewById(R.id.txt_correlation_1);
        tv2=(TextView) v.findViewById(R.id.txt_correlation_2);

        tv1.setText(getResources().getString(R.string.txt_correaltion_1));
        tv2.setText(getResources().getString(R.string.txt_correaltion_2));





        return v;
    }
}
