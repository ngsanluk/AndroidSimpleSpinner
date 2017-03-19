package hk.com.sunnyng.simplespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a reference to spinner
        Spinner mySpinner = (Spinner) findViewById(R.id.mySpinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbersForSpinner, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        mySpinner.setAdapter(adapter);

    }

    public void showSelection(View v) {
        // Create reference to spinner
        Spinner mySpinner = (Spinner) findViewById(R.id.mySpinner);

        // Create a reference to TextView
        TextView myTextView = (TextView) findViewById(R.id.myTextView);

        // Read the selected item and convert to int type for further calculation
        int i = Integer.parseInt(mySpinner.getSelectedItem().toString());

        // Update text view
        myTextView.setText("You have selected: " + i);
    }
}
