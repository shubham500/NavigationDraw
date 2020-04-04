package com.example.navigationdrawer.ui.calculator;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigationdrawer.R;

public class CalculatorFragment extends Fragment {
    TextView textView,textView1,textView2,textView3,textView4;
    EditText editText1,editText2;
    String string1,string2;
    private CalculatorViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(CalculatorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calculator, container, false);


          textView = root.findViewById(R.id.tvresult);
          editText1 = root.findViewById(R.id.edno1);
          editText2 = root.findViewById(R.id.edno2);
         Button button = root.findViewById(R.id.cal);
          textView1 = root.findViewById(R.id.tvresult1);
          textView2 = root.findViewById(R.id.tvresult2);
          textView3 = root.findViewById(R.id.tvresult3);
          textView4 = root.findViewById(R.id.tvresult4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string1=editText1.getText().toString().trim();
                string2=editText2.getText().toString().trim();
                if(string1.length()==0 || string2.length()==0)
                {
                    showMessage("Invalid Input");
                    Toast.makeText(getContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
                }
                else if (string1.length()!=0 && string2.length()!=0){
                    int a=Integer.parseInt(string1);
                    int b=Integer.parseInt(string2);
                    int c=a+b;
                    int d=a-b;
                    int e=a/b;
                    int f=a*b;
                    Toast.makeText(getContext(),"Result of addition is="+c, Toast.LENGTH_SHORT).show();
                    textView1.setText(String.valueOf(c));
                    Toast.makeText(getContext(), "Result of substraction is="+d, Toast.LENGTH_SHORT).show();
                    textView2.setText(String.valueOf(d));
                    Toast.makeText(getContext(), "Result of Division is="+e, Toast.LENGTH_SHORT).show();
                    textView3.setText(String.valueOf(e));
                    Toast.makeText(getContext(), "Result of Multiplication is="+f, Toast.LENGTH_SHORT).show();
                    textView4.setText(String.valueOf(f));
                }
            }

        });
        return root;
    }

    private void showMessage(String invalid_input) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
        builder.setMessage(invalid_input);
        builder.setCancelable(true);
        builder.setTitle("Calculator");
        builder.show();
    }



}