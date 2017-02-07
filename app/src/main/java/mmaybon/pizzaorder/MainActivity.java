package mmaybon.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {

    TextView totalView;
    RadioButton smallRadio;
    RadioButton mediumRadio;
    RadioButton largeRadio;
    CheckBox cheeseBox;
    CheckBox delivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalView = (TextView) findViewById(R.id.totalView);
        smallRadio = (RadioButton) findViewById(R.id.smallRadio);
        mediumRadio = (RadioButton) findViewById(R.id.mediumRadio);
        largeRadio = (RadioButton) findViewById(R.id.largeRadio);
        cheeseBox = (CheckBox) findViewById(R.id.cheeseBox);
        delivery = (CheckBox) findViewById(R.id.deliveryBox);
    }

    public void buttonClick(View view) {
        double totalCost = 0.00;
        if (smallRadio.isChecked()) {
            totalCost += 7.00;
        }
        if (mediumRadio.isChecked()) {
            totalCost += 9.00;
        }
        if (largeRadio.isChecked()) {
            totalCost += 13.00;
        }
        if (cheeseBox.isChecked()) {
            totalCost += 1.75;
        }
        if (delivery.isChecked()) {
            totalCost += 2.50;
        }
         totalView.setText(String.format("Total is $%.2f", totalCost));





        }

    }

