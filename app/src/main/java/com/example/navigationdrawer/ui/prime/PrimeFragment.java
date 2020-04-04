package com.example.navigationdrawer.ui.prime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigationdrawer.R;

public class PrimeFragment extends Fragment {
    TextView textView1;
    EditText editText;
    Button button;

    String string1;
    private PrimeViewModel primeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        primeViewModel =
                ViewModelProviders.of(this).get(PrimeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_prime, container, false);


          textView1 =root.findViewById(R.id.tvresult1);
         editText =root.findViewById(R.id.edno1);
         button =root.findViewById(R.id.cal1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string1 = editText.getText().toString().trim();
                int i = 1, count = 0;
                int n = Integer.parseInt(string1);
                while (i <= n) {
                    if (n % i == 0) {
                        count++;
                    }
                    i++;
                }
                if (count == 2) {
                    Toast.makeText(getContext(), ""+n+" is prime" , Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), ""+n+" is not prime" , Toast.LENGTH_SHORT).show();

                }
            }
        });
        return root;
    }
}