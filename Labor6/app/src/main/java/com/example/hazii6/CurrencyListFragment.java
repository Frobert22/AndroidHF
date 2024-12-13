package com.example.hazii6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

class CurrencyListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_currency_list, container, false);

        ListView listView = rootView.findViewById(R.id.listView);
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("EUR", "4.4100", "4.5500"));
        currencyList.add(new Currency("USD", "3.9750", "41.1450"));
        currencyList.add(new Currency("AUD", "3.9750", "1.1450"));
        currencyList.add(new Currency("CAD", "3.9750", "2.1450"));
        currencyList.add(new Currency("CHF", "4.9750", "3.1450"));
        currencyList.add(new Currency("DKK", "5.9750", "4.1450"));
        currencyList.add(new Currency("HUF", "7.9750", "1.23210"));

        CurrencyAdapter adapter = new CurrencyAdapter(requireContext(), currencyList);
        listView.setAdapter(adapter);

        return rootView;
    }
}
