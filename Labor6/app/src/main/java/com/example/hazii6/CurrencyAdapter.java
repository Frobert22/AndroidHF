package com.example.hazii6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CurrencyAdapter extends ArrayAdapter<Currency> {

    public CurrencyAdapter(Context context, List<Currency> currencies) {
        super(context, 0, currencies);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_currency, parent, false);
        }

        Currency currency = getItem(position);

        TextView codeView = convertView.findViewById(R.id.currencyCode);
        TextView buyPriceView = convertView.findViewById(R.id.buyPrice);
        TextView sellPriceView = convertView.findViewById(R.id.sellPrice);

        assert currency != null;
        codeView.setText(currency.getCode());
        buyPriceView.setText(currency.getBuyPrice());
        sellPriceView.setText(currency.getSellPrice());

        return convertView;
    }
}
