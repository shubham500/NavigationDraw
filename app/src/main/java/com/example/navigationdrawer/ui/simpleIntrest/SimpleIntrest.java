package com.example.navigationdrawer.ui.simpleIntrest;

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
import com.example.navigationdrawer.ui.temperatureconversion.TemperatureViewModel;

public class SimpleIntrest extends Fragment {
    TextView textView;
    EditText editText1,editText2,editText3;
    Button button;
    String string1,string2,string3;
    private SimpleIntrestViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {

        mViewModel =
                ViewModelProviders.of(this).get(SimpleIntrestViewModel.class);

        View root= inflater.inflate(R.layout.simple_intrest_fragment, container, false);

        textView=root.findViewById(R.id.tvresults2);
        editText1=root.findViewById(R.id.ednos2);
        editText2=root.findViewById(R.id.ednos3);
        editText3=root.findViewById(R.id.ednos4);
        button=root.findViewById(R.id.cals2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                string1=editText1.getText().toString().trim();
                string2=editText2.getText().toString().trim();
                string3=editText3.getText().toString().trim();

                float  sinterest;
                //Scanner scan = new Scanner(System.in);
                //System.out.print("Enter the Principal : ");

                float p=Float.parseFloat(string1);
                float r=Float.parseFloat(string2);
                float t=Float.parseFloat(string3);

                // System.out.print("Enter the Rate of interest : ");
                // r = scan.nextFloat();
                //System.out.print("Enter the Time period : ");
                // t = scan.nextFloat();
                //scan.close();
                sinterest = (p * r * t) / 100;
                Toast.makeText(getContext(), "Simple Interest is:"+sinterest, Toast.LENGTH_SHORT).show();

            }

        });
        return root;

    }
}
