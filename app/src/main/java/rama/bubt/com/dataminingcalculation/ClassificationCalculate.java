package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rama.bubt.Classification;
import com.rama.bubt.DialogMessage;
import com.rama.bubt.StandardDeviation;

public class ClassificationCalculate extends Fragment {
    private EditText etYesValues, etNoValues, etInputValues;
    private TextView numberOfYes, numberOfNo, avgY, avgN, tvStandardYes, tvStandardNo, tvParcentageYes, tvParcentageNo, tvOutput;

    private Button btnClassification;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.classification_calculate, container, false);

        etYesValues = (EditText) v.findViewById(R.id.etYesValues);
        etNoValues = (EditText) v.findViewById(R.id.etNoValues);
        etInputValues = (EditText) v.findViewById(R.id.etinputClassification);

        numberOfNo = (TextView) v.findViewById(R.id.txtNumberNo);
        numberOfYes = (TextView) v.findViewById(R.id.txtNumberOfYes);
        avgN = (TextView) v.findViewById(R.id.txtAvgNo);
        avgY = (TextView) v.findViewById(R.id.txtAvgYes);
        tvStandardNo = (TextView) v.findViewById(R.id.standardNoValues);
        tvStandardYes = (TextView) v.findViewById(R.id.standardYesValues);
        tvOutput = (TextView) v.findViewById(R.id.tvOutputClassification);
        tvParcentageYes = (TextView) v.findViewById(R.id.tvOutputParcentageY);
        tvParcentageNo = (TextView) v.findViewById(R.id.tvOutputParcentageN);


        btnClassification = (Button) v.findViewById(R.id.btnClassification);

        btnClassification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = etInputValues.getText().toString();
                String Yvalues = etYesValues.getText().toString();
                String Nvalues = etNoValues.getText().toString();
                try {
                    Classification.classificationDerivation(Yvalues);
                    avgY.setText(String.valueOf(Classification.getAvg()));
                    tvStandardYes.setText(Classification.getStDeviation());
                    numberOfYes.setText(String.valueOf(Classification.getLength()));
                    double tempStandardY = Double.valueOf(Classification.getStDeviation());
                    double temAvgY = Double.valueOf(Classification.getAvg());
                    double tempNY = Double.valueOf(Classification.getLength());

                    Classification.classificationDerivation(Nvalues);
                    avgN.setText(String.valueOf(Classification.getAvg()));
                    numberOfNo.setText(String.valueOf(Classification.getLength()));
                    tvStandardNo.setText(": " + Classification.getStDeviation());
                    double tempStandardN = Double.valueOf(Classification.getStDeviation());
                    double temAvgN = Double.valueOf(Classification.getAvg());
                    double tempNN = Double.valueOf(Classification.getLength());

                    int num = Integer.parseInt(input);

                    Classification.probability(num, tempStandardY, tempStandardN, temAvgY, temAvgN, tempNY, tempNN);

                    tvParcentageYes.setText("% yes :" + Classification.getPy());
                    tvParcentageNo.setText("% no :" + Classification.getPn());
                    tvOutput.setText(Classification.getByes());

                } catch (Exception e) {
                    DialogMessage.showDialog(getContext(), R.string.valid_input);
                }

            }
        });

        return v;
    }


}
