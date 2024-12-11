package com.example.labor1_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.labor1_1.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textViewResult = findViewById(R.id.textViewResult);

        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);

        buttonAdd.setOnClickListener(view -> calculate("+"));
        buttonSubtract.setOnClickListener(view -> calculate("-"));
        buttonMultiply.setOnClickListener(view -> calculate("*"));
        buttonDivide.setOnClickListener(view -> calculate("/"));
    }

    private void calculate(String operation) {
        try {
            double num1 = Double.parseDouble(editTextNumber1.getText().toString());
            double num2 = Double.parseDouble(editTextNumber2.getText().toString());
            double result;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero!");
                    }
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
                    break;
            }
            textViewResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input: please enter valid numbers!", Toast.LENGTH_SHORT).show();
        } catch (ArithmeticException e) {
            Toast.makeText(this, "Division by zero is not allowed!", Toast.LENGTH_SHORT).show();
        }
    }
}
