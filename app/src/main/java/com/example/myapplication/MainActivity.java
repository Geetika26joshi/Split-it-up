package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // by ID we can use each component which id is assign in xml file
        EditText tot = (EditText) findViewById(R.id.total);
        EditText name1 = (EditText) findViewById(R.id.name1);
        EditText name2 = (EditText) findViewById(R.id.name2);
        EditText name3 = (EditText) findViewById(R.id.name3);
        EditText amt1 = (EditText) findViewById(R.id.amount1);
        EditText amt2 = (EditText) findViewById(R.id.amount2);
        EditText amt3 = (EditText) findViewById(R.id.amount3);


        Button submitButton = (Button) findViewById(R.id.button);
        TextView result = (TextView) findViewById(R.id.result);

        // Add_button add clicklistener
        submitButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double total=Double.parseDouble(tot.getText().toString());
                double num1 = Double.parseDouble(amt1.getText().toString());
                double num2 = Double.parseDouble(amt2.getText().toString());
                double num3 = Double.parseDouble(amt3.getText().toString());
                String n3=name3.getText().toString();
                double correct;
                double sum1,sum2,sum3;


                if(n3!="")
                {
                    correct= total/3;


                }
                else
                {
                    correct =total/2;
                }
                sum1=num1-correct;
                String s1= Double.toString(sum1);
                sum2=num2-correct;
                String s2= Double.toString(sum2);
                sum3=num3-correct;
                String s3= Double.toString(sum3);
                // add both number and store it to sum

                // set it ot result textvie

                result.setText( name1.getText().toString());
                result.append("   Has balance of :  ");
                result.append(s1 +" \n");
                result.append(" \n");
                result.append( name2.getText().toString());
                result.append("   Has balance of :  ");
                result.append(s2);
                result.append(" \n");
                result.append( name3.getText().toString());
                result.append("   Has balance of :  ");
                result.append(s3);
               //200 result.setText(s3);
               // result,s2,s3);
               // result.setText("$name1 should have "+ Double.toString(sum1)+"$name2 should have "+Double.toString(sum2)+"$name3 should have "+Double.toString(sum3));
            }
        });
    }
}

