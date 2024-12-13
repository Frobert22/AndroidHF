package com.example.haziharom;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCode, editTextName, editTextPrice;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCode = findViewById(R.id.editTextCode);
        editTextName = findViewById(R.id.editTextName);
        editTextPrice = findViewById(R.id.editTextPrice);
        productList = new ArrayList<>();

        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonCancel = findViewById(R.id.buttonCancel);

        buttonAdd.setOnClickListener(view -> addProduct());
        buttonCancel.setOnClickListener(view -> clearFields());
    }

    private void addProduct() {
        String code = editTextCode.getText().toString().trim();
        String name = editTextName.getText().toString().trim();
        double price;

        try {
            price = Double.parseDouble(editTextPrice.getText().toString().trim());
        } catch (NumberFormatException e) {
            editTextPrice.setError("Invalid price");
            return;
        }

        Product product = new Product(code, name, price);
        productList.add(product);

        clearFields();
    }

    private void clearFields() {
        editTextCode.setText("");
        editTextName.setText("");
        editTextPrice.setText("");
    }


}
