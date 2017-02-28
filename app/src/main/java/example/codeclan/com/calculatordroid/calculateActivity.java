package example.codeclan.com.calculatordroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculateActivity extends AppCompatActivity {

    TextView calculateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        calculateTextView = (TextView) findViewById(R.id.CalculateView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int result = extras.getInt("result");

        calculateTextView.setText("The answer is " + result);
    }


}
