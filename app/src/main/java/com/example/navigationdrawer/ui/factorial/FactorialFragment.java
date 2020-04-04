package com.example.navigationdrawer.ui.factorial;

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

public class FactorialFragment extends Fragment {
    String string1;
    TextView textView3;
    EditText editText3;
    Button button3;
    private FactorialViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(FactorialViewModel.class);
        View root = inflater.inflate(R.layout.fragment_factorialnumber, container, false);


        textView3 = root.findViewById(R.id.tvresult2);
        editText3 = root.findViewById(R.id.edno1);
        button3 = root.findViewById(R.id.cal2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string1 = editText3.getText().toString().trim();
                int fact = 1;
                int n = Integer.parseInt(string1);
                //Toast.makeText(MainActivity.this, "Enter number bet 1 to 10 " + n, Toast.LENGTH_SHORT).show();
                try {

                    //Toast.makeText(MainActivity.this, "Enter number " + n, Toast.LENGTH_SHORT).show();
                    while (n != 0) {
                        fact = fact * n;
                        n--;
                    }
                    Toast.makeText(getContext(), "Result= " + fact, Toast.LENGTH_SHORT).show();
                    // System.out.println("Result =" + fact);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Not a number " + fact, Toast.LENGTH_SHORT).show();
                }
            }
        });
        return root;
    }
}