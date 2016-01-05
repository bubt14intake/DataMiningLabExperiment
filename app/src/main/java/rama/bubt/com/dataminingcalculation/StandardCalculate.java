package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rama.bubt.DialogMessage;
import com.rama.bubt.StandardDeviation;


public class StandardCalculate extends Fragment {


    private Button cal;
    private TextView means, st, variance, numbers;
    EditText etNumbers;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.standard_cal, container, false);

        cal = (Button) v.findViewById(R.id.btnClick);
        means = (TextView) v.findViewById(R.id.txtMeans);
        st = (TextView) v.findViewById(R.id.txtStandard);
        variance = (TextView) v.findViewById(R.id.txtVarience);
        numbers = (TextView) v.findViewById(R.id.txtTotalNumbers);
        etNumbers = (EditText) v.findViewById(R.id.etInput);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String values = etNumbers.getText().toString();

                try {
                    // set values
                    StandardDeviation.standardDeviation(values);

                    means.setText(StandardDeviation.getMeans());
                    st.setText(String.valueOf(StandardDeviation.getDeviation()));
                    variance.setText(StandardDeviation.getVariance());
                    numbers.setText(String.valueOf(StandardDeviation.getNumbers()));
                } catch (Exception e) {
                    DialogMessage.showDialog(getContext(), R.string.valid_input);
                }


            }
        });

        return v;
    }
}