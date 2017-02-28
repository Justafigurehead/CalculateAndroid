package example.codeclan.com.calculatordroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorMainActivity extends AppCompatActivity {

    EditText inputOne;
    EditText inputTwo;
    Button addButton;
    Calculator calculate;
    int ResultOne;
    int ResultTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

        inputOne = (EditText) findViewById(R.id.NumberOneEditText);
        inputTwo = (EditText) findViewById(R.id.NumberTwoEditText);
        addButton = (Button) findViewById(R.id.CalculateBtn);
        calculate = new Calculator();

    }

    public void setUpIntent(){
        String inputOneResult = inputOne.getText().toString();
        String inputTwoResult = inputTwo.getText().toString();

        ResultOne = Integer.parseInt(inputOneResult);
        ResultTwo = Integer.parseInt(inputTwoResult);
    }

    public void onClickAdd(View view){
        setUpIntent();
        int result = calculate.add(ResultOne, ResultTwo);

        Intent intent = new Intent(CalculatorMainActivity.this, calculateActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onClickSubtract(View view){
        setUpIntent();
        int result = calculate.subtract(ResultOne, ResultTwo);

        Intent intent = new Intent(CalculatorMainActivity.this, calculateActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

}
