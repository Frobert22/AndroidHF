package com.example.hazi4;

import android.os.Bundle;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView = findViewById(R.id.listView);
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("EUR", "4.4100", "4.5500"));
        currencyList.add(new Currency("USD", "3.9750", "41.1450"));
        currencyList.add(new Currency("AUD", "3.9750", "1.1450"));
        currencyList.add(new Currency("CAD", "3.9750", "2.1450"));
        currencyList.add(new Currency("CHF", "4.9750", "3.1450"));
        currencyList.add(new Currency("DKK", "5.9750", "4.1450"));
        currencyList.add(new Currency("HUF", "7.9750", "1.23210"));



        CurrencyAdapter adapter = new CurrencyAdapter(this, currencyList);
        listView.setAdapter(adapter);
    }
}
