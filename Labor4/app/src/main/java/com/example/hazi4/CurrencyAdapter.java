package com.example.hazi4;

import android.annotation.SuppressLint;
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

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_currency, parent, false);
        }

        Currency currency = getItem(position);

        TextView currencyCode = convertView.findViewById(R.id.currencyCode);
        TextView buyPrice = convertView.findViewById(R.id.buyPrice);
        TextView sellPrice = convertView.findViewById(R.id.sellPrice);

        assert currency != null;
        currencyCode.setText(currency.getCode());
        buyPrice.setText("Cumpară: " + currency.getBuyPrice() + " RON");
        sellPrice.setText("Vinde: " + currency.getSellPrice() + " RON");

        if (currency.isExpanded()) {
            buyPrice.setVisibility(View.VISIBLE);
            sellPrice.setVisibility(View.VISIBLE);
        } else {
            buyPrice.setVisibility(View.GONE);
            sellPrice.setVisibility(View.GONE);
        }

        convertView.setOnClickListener(v -> {
            currency.setExpanded(!currency.isExpanded());
            notifyDataSetChanged();
        });

        return convertView;
    }
}
