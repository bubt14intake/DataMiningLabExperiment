package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rama.bubt.DialogMessage;
import com.rama.bubt.Quatile;

import org.w3c.dom.Text;


public class QuatileActivity extends Fragment {
    private EditText etQuatileValues;
    private TextView first, median, third, numbers, interQuatile;
    private Button btnCalculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.quatile_calculation, container, false);
        etQuatileValues = (EditText) v.findViewById(R.id.etInputQuartileValues);
        first = (TextView) v.findViewById(R.id.txtfirstquartile);
        third = (TextView) v.findViewById(R.id.txtthirdquartile);
        median = (TextView) v.findViewById(R.id.txtmedian);
        numbers = (TextView) v.findViewById(R.id.txtQuatileNumbers);
        interQuatile = (TextView) v.findViewById(R.id.txtInterQuitle);

        btnCalculate = (Button) v.findViewById(R.id.btnQuartile);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String values = etQuatileValues.getText().toString();
                try {
                    Quatile.quatileCalculaion(values);
                    first.setText(String.valueOf(Quatile.getQ1()));
                    third.setText(String.valueOf(Quatile.getQ3()));
                    median.setText(String.valueOf(Quatile.getMedian()));
                    numbers.setText(String.valueOf(Quatile.getNumbers()));
                    interQuatile.setText(String.valueOf(Quatile.getInterQuatileRange()));
                } catch (Exception e) {
                    DialogMessage.showDialog(getContext(), R.string.valid_input);
                }
            }
        });
        return v;
    }
}
