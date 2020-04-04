package com.example.navigationdrawer.ui.palindrome;

import androidx.lifecycle.ViewModelProviders;

import android.app.AlertDialog;
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


public class PalindromeFragment extends Fragment {
    TextView textView;
    Button button;
    EditText editText;
    String string;

    private PalindromeViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(PalindromeViewModel.class);

        View root=inflater.inflate(R.layout.palindrome_fragment, container, false);

        textView = root.findViewById(R.id.tvresults);
        editText = root.findViewById(R.id.ednos);
        button = root.findViewById(R.id.calc);
       // Toast.makeText(getContext(),"ggggg", Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string = editText.getText().toString().trim();

                int r, sum = 0, temp;
                //int n=454;//It is the number variable to be checked for palindrome
                int n = Integer.parseInt(string);
                temp = n;
                while (n > 0) {
                    r = n % 10;  //getting remainder
                    sum = (sum * 10) + r;
                    n = n / 10;
                }
                if (temp == sum)
                    Toast.makeText(getContext(), "palindrome number ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getContext(), "Not palindrome number ", Toast.LENGTH_SHORT).show();

            }
        });
        return root;
    }
}
