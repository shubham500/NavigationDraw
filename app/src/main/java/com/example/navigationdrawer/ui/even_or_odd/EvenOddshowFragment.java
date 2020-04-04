package com.example.navigationdrawer.ui.even_or_odd;

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

public class EvenOddshowFragment extends Fragment {
    String string1;
    EditText editText2;
    TextView textView2;
    Button button2;
    private EvenOddViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(EvenOddViewModel.class);
        View root = inflater.inflate(R.layout.fragment_evenodd, container, false);

        textView2 = root.findViewById(R.id.tvresult1);
        editText2 = root.findViewById(R.id.edno1);
        button2 = root.findViewById(R.id.cal1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string1 = editText2.getText().toString().trim();
                int n = Integer.parseInt(string1);
                if (n % 2 == 0) {
                    Toast.makeText(getContext(), "" + n + " is Even ", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(getContext(), "" + n + " is Odd ", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}