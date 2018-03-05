package com.example.intagpc.autocompletetextveiw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;
    private String[] emails = {"ali@gmail.com", "aliya@gmail.com", "sania@gmail.com", "arshia@gmail.com", "aqsa@gmail.com", "ahmed@yahoo.com", "saleem@hotmail.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setAutoCompleteAdapter();
        setMultiCompleteAdapter();


    }

    public void initWidgets() {
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoComplete);

    }

    public void setAutoCompleteAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, emails);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }

    public void setMultiCompleteAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, emails);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
