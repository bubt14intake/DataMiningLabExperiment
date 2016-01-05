package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rama.bubt.CorrelationCoEficient;
import com.rama.bubt.DialogMessage;

public class CorrelationCalculate extends Fragment implements View.OnClickListener {


    private EditText etX1, etX2, etX3, etX4, etX5, etX6, etX7, etX8, etX9, etX10, etX11, etX12,
            etY1, etY2, etY3, etY4, etY5, etY6, etY7, etY8, etY9, etY10, etY11, etY12;
    private TextView txtVisible1, txtVisible2, txtVisible3, txtVisible4, txtVisible5, txtVisible6, txtVisible7, txtVisible8,
            txtVisible9, txtVisible10, txtVisible11, txtCorrelation, txtCorrelationNumber;
    private LinearLayout Ln1, Ln2, Ln3, Ln4, Ln5, Ln6, Ln7, Ln8, Ln9, Ln10, Ln11;
    Button btnCorrelation;
    int n = 1;
    int[][] values;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.correlation_cal, container, false);

        etX1 = (EditText) v.findViewById(R.id.etX1);
        etX2 = (EditText) v.findViewById(R.id.etX2);
        etX3 = (EditText) v.findViewById(R.id.etX3);
        etX4 = (EditText) v.findViewById(R.id.etX4);
        etX5 = (EditText) v.findViewById(R.id.etX5);
        etX6 = (EditText) v.findViewById(R.id.etX6);
        etX7 = (EditText) v.findViewById(R.id.etX7);
        etX8 = (EditText) v.findViewById(R.id.etX8);
        etX9 = (EditText) v.findViewById(R.id.etX9);
        etX10 = (EditText) v.findViewById(R.id.etX10);
        etX11 = (EditText) v.findViewById(R.id.etX11);
        etX12 = (EditText) v.findViewById(R.id.etX12);

        etY1 = (EditText) v.findViewById(R.id.etY1);
        etY2 = (EditText) v.findViewById(R.id.etY2);
        etY3 = (EditText) v.findViewById(R.id.etY3);
        etY4 = (EditText) v.findViewById(R.id.etY4);
        etY5 = (EditText) v.findViewById(R.id.etY5);
        etY6 = (EditText) v.findViewById(R.id.etY6);
        etY7 = (EditText) v.findViewById(R.id.etY7);
        etY8 = (EditText) v.findViewById(R.id.etY8);
        etY9 = (EditText) v.findViewById(R.id.etY9);
        etY10 = (EditText) v.findViewById(R.id.etY10);
        etY11 = (EditText) v.findViewById(R.id.etY11);
        etY12 = (EditText) v.findViewById(R.id.etY12);

        txtVisible1 = (TextView) v.findViewById(R.id.txtVisible1);
        txtVisible2 = (TextView) v.findViewById(R.id.txtVisible2);
        txtVisible3 = (TextView) v.findViewById(R.id.txtVisible3);
        txtVisible4 = (TextView) v.findViewById(R.id.txtVisible4);
        txtVisible5 = (TextView) v.findViewById(R.id.txtVisible5);
        txtVisible6 = (TextView) v.findViewById(R.id.txtVisible6);
        txtVisible7 = (TextView) v.findViewById(R.id.txtVisible7);
        txtVisible8 = (TextView) v.findViewById(R.id.txtVisible8);
        txtVisible9 = (TextView) v.findViewById(R.id.txtVisible9);
        txtVisible10 = (TextView) v.findViewById(R.id.txtVisible10);
        txtVisible11 = (TextView) v.findViewById(R.id.txtVisible11);


        txtCorrelation = (TextView) v.findViewById(R.id.txtCorrelatiion);
        txtCorrelationNumber = (TextView) v.findViewById(R.id.txtCorrelationNumbers);
        btnCorrelation = (Button) v.findViewById(R.id.btnCorrelation);

        Ln1 = (LinearLayout) v.findViewById(R.id.layoutOne);
        Ln2 = (LinearLayout) v.findViewById(R.id.layoutTwo);
        Ln3 = (LinearLayout) v.findViewById(R.id.layoutThree);
        Ln4 = (LinearLayout) v.findViewById(R.id.layoutFour);
        Ln5 = (LinearLayout) v.findViewById(R.id.layoutFive);
        Ln6 = (LinearLayout) v.findViewById(R.id.layoutSix);
        Ln7 = (LinearLayout) v.findViewById(R.id.layoutSeven);
        Ln8 = (LinearLayout) v.findViewById(R.id.layoutEight);
        Ln9 = (LinearLayout) v.findViewById(R.id.layoutNine);
        Ln10 = (LinearLayout) v.findViewById(R.id.layoutTen);
        Ln11 = (LinearLayout) v.findViewById(R.id.layoutEleven);


        txtVisible1.setOnClickListener(this);
        txtVisible2.setOnClickListener(this);
        txtVisible3.setOnClickListener(this);
        txtVisible4.setOnClickListener(this);
        txtVisible5.setOnClickListener(this);
        txtVisible6.setOnClickListener(this);
        txtVisible7.setOnClickListener(this);
        txtVisible8.setOnClickListener(this);
        txtVisible9.setOnClickListener(this);
        txtVisible10.setOnClickListener(this);
        txtVisible11.setOnClickListener(this);


        btnCorrelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                values = new int[n][2];
                String x1 = etX1.getText().toString();
                String y1 = etY1.getText().toString();

                try {
                    values[0][0] = Integer.valueOf(x1);
                    values[0][1] = Integer.valueOf(y1);

                    if (etX2.getVisibility() == v.VISIBLE) {
                        values[1][0] = Integer.valueOf(etX2.getText().toString());
                    }
                    if (etY2.getVisibility() == v.VISIBLE) {
                        values[1][1] = Integer.valueOf(etY2.getText().toString());
                    }
                    if (etX3.getVisibility() == v.VISIBLE) {
                        values[2][0] = Integer.valueOf(etX3.getText().toString());
                    }
                    if (etY3.getVisibility() == v.VISIBLE) {
                        values[2][1] = Integer.valueOf(etY3.getText().toString());
                    }
                    if (etX4.getVisibility() == v.VISIBLE) {
                        values[3][0] = Integer.valueOf(etX4.getText().toString());
                    }
                    if (etY4.getVisibility() == v.VISIBLE) {
                        values[3][1] = Integer.valueOf(etY4.getText().toString());
                    }
                    if (etX5.getVisibility() == v.VISIBLE) {
                        values[4][0] = Integer.valueOf(etX5.getText().toString());
                    }
                    if (etY5.getVisibility() == v.VISIBLE) {
                        values[4][1] = Integer.valueOf(etY5.getText().toString());
                    }
                    if (etX6.getVisibility() == v.VISIBLE) {
                        values[5][0] = Integer.valueOf(etX6.getText().toString());
                    }
                    if (etY6.getVisibility() == v.VISIBLE) {
                        values[5][1] = Integer.valueOf(etY6.getText().toString());
                    }
                    if (etX7.getVisibility() == v.VISIBLE) {
                        values[6][0] = Integer.valueOf(etX7.getText().toString());
                    }
                    if (etY7.getVisibility() == v.VISIBLE) {
                        values[6][1] = Integer.valueOf(etY7.getText().toString());
                    }
                    if (etX8.getVisibility() == v.VISIBLE) {
                        values[7][0] = Integer.valueOf(etX8.getText().toString());
                    }
                    if (etY8.getVisibility() == v.VISIBLE) {
                        values[7][1] = Integer.valueOf(etY8.getText().toString());
                    }
                    if (etX9.getVisibility() == v.VISIBLE) {
                        values[8][0] = Integer.valueOf(etX9.getText().toString());
                    }
                    if (etY9.getVisibility() == v.VISIBLE) {
                        values[8][1] = Integer.valueOf(etY9.getText().toString());
                    }
                    if (etX10.getVisibility() == v.VISIBLE) {
                        values[9][0] = Integer.valueOf(etX10.getText().toString());
                    }
                    if (etY10.getVisibility() == v.VISIBLE) {

                        values[9][1] = Integer.valueOf(etY10.getText().toString());
                    }
                    if (etX11.getVisibility() == v.VISIBLE) {
                        values[10][0] = Integer.valueOf(etX11.getText().toString());
                    }
                    if (etY11.getVisibility() == v.VISIBLE) {

                        values[10][1] = Integer.valueOf(etY11.getText().toString());
                    }
                    if (etX12.getVisibility() == v.VISIBLE) {
                        values[11][0] = Integer.valueOf(etX12.getText().toString());
                    }
                    if (etY12.getVisibility() == v.VISIBLE) {
                        values[11][1] = Integer.valueOf(etY12.getText().toString());
                    }

                    // calculate correlation
                    String r = CorrelationCoEficient.correlation(values);

                    txtCorrelationNumber.setText(String.valueOf(values.length));
                    txtCorrelation.setText(r);
                } catch (Exception e) {
                    DialogMessage.showDialog(getContext(), R.string.err_fields_empty
                    );
                }

            }
        });
        return v;
    }
    //set visibility

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtVisible1:
                Ln1.setVisibility(v.VISIBLE);
                etX2.setVisibility(v.VISIBLE);
                etY2.setVisibility(v.VISIBLE);
                txtVisible2.setVisibility(v.VISIBLE);
                txtVisible1.setVisibility(v.GONE);
                n++;
                break;
            case R.id.txtVisible2:
                Ln2.setVisibility(v.VISIBLE);
                etX3.setVisibility(v.VISIBLE);
                etY3.setVisibility(v.VISIBLE);
                txtVisible2.setVisibility(v.GONE);
                txtVisible3.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible3:
                Ln3.setVisibility(v.VISIBLE);
                etX4.setVisibility(v.VISIBLE);
                etY4.setVisibility(v.VISIBLE);
                txtVisible3.setVisibility(v.GONE);
                txtVisible4.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible4:
                Ln4.setVisibility(v.VISIBLE);
                etX5.setVisibility(v.VISIBLE);
                etY5.setVisibility(v.VISIBLE);
                txtVisible4.setVisibility(v.GONE);
                txtVisible5.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible5:
                Ln5.setVisibility(v.VISIBLE);
                etX6.setVisibility(v.VISIBLE);
                etY6.setVisibility(v.VISIBLE);
                txtVisible5.setVisibility(v.GONE);
                txtVisible6.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible6:
                Ln6.setVisibility(v.VISIBLE);
                etX7.setVisibility(v.VISIBLE);
                etY7.setVisibility(v.VISIBLE);
                txtVisible6.setVisibility(v.GONE);
                txtVisible7.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible7:
                Ln7.setVisibility(v.VISIBLE);
                etX8.setVisibility(v.VISIBLE);
                etY8.setVisibility(v.VISIBLE);
                txtVisible7.setVisibility(v.GONE);
                txtVisible8.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible8:
                Ln8.setVisibility(v.VISIBLE);
                etX9.setVisibility(v.VISIBLE);
                etY9.setVisibility(v.VISIBLE);
                txtVisible8.setVisibility(v.GONE);
                txtVisible9.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible9:
                Ln9.setVisibility(v.VISIBLE);
                etX10.setVisibility(v.VISIBLE);
                etY10.setVisibility(v.VISIBLE);
                txtVisible9.setVisibility(v.GONE);
                txtVisible10.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible10:
                Ln10.setVisibility(v.VISIBLE);
                etX11.setVisibility(v.VISIBLE);
                etY11.setVisibility(v.VISIBLE);
                txtVisible10.setVisibility(v.GONE);
                txtVisible11.setVisibility(v.VISIBLE);
                n++;
                break;
            case R.id.txtVisible11:
                Ln11.setVisibility(v.VISIBLE);
                etX12.setVisibility(v.VISIBLE);
                etY12.setVisibility(v.VISIBLE);
                txtVisible11.setVisibility(v.GONE);
                n++;
                break;

        }
    }


}