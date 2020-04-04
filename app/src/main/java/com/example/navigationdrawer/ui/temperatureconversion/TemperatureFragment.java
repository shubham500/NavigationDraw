package com.example.navigationdrawer.ui.temperatureconversion;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.ui.palindrome.PalindromeViewModel;

public class TemperatureFragment extends Fragment {
    TextView textView;
    EditText editText;
    Button button;
    String string;

    private TemperatureViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mViewModel =
                ViewModelProviders.of(this).get(TemperatureViewModel.class);

        View root = inflater.inflate(R.layout.temperature_fragment, container, false);

        textView = root.findViewById(R.id.tvresults1);
        editText = root.findViewById(R.id.ednos1);
        button = root.findViewById(R.id.cals1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string = editText.getText().toString().trim();

                //    Toast.makeText(Temperature.this, "Enter temperature in Fahrenheit", Toast.LENGTH_SHORT).show();
                //System.out.println("Enter temperature in Fahrenheit");
                //temperature = in.nextInt();
                float temperature = Float.parseFloat(string);
                temperature = ((temperature - 32) * 5) / 9;
                Toast.makeText(getContext(), "" + temperature + " temperature in celsius ", Toast.LENGTH_SHORT).show();
                //System.out.println("temperature in Celsius = " + temperature);
            }
        });
        return root;


    }
}

