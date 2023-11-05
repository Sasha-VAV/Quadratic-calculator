package ru.samsung.itschool.mdev.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText objectA, objectB, objectC;
    public TextView res;
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button)findViewById(R.id.run);
        res=(TextView)findViewById(R.id.res);
        objectA=(EditText)findViewById(R.id.a);
        objectB=(EditText)findViewById(R.id.b);
        objectC=(EditText)findViewById(R.id.c);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(objectA.getText().toString());
                b=Double.parseDouble(objectB.getText().toString());
                c=Double.parseDouble(objectC.getText().toString());
                if (a==0){
                    if (b==0){
                        if (c==0){
                            res.setText("any");
                        }
                        else{
                            res.setText("none");
                        }
                    }
                    else{
                        res.setText(Double.toString((-c)/b));
                    }
                }
                else{
                    double d=0;
                    d=b*b-4*a*c;
                    if (d<0){
                        res.setText("none");
                    } else if (d==0) {
                        res.setText(Double.toString(-b/(2*a)));
                    }
                    else{
                        d=Math.pow(d,0.5);
                        res.setText(Double.toString((-b+d)/(2*a))+" "+Double.toString((-b-d)/(2*a)));
                    }
                }
            }
        });

    }


}