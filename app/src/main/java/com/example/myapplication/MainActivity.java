package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editext;
    private Button kgtog,gtokg,mtocm,cmtom,submit;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editext=findViewById(R.id.editext);
        text=findViewById(R.id.textView);
        kgtog=findViewById(R.id.button2);
        gtokg=findViewById(R.id.button3);
        mtocm=findViewById(R.id.button4);
        cmtom=findViewById(R.id.button5);
        submit=findViewById(R.id.button);


    }
public int a;
    public void submit(View view)
    {
        if(a==1)
        {
            String s=editext.getText().toString();
            Double v=Double.parseDouble(s);
            double ans=v/100;
            text.setText("Converted centimetre to metre:- "+ans);
        }
        else if(a==2)
        {
            String s=editext.getText().toString();
            Integer v=Integer.parseInt(s);
            double ans=v*100;
            text.setText("Converted metre to centimetre:- "+ans);
        }
        else if(a==3)
        {
            String s=editext.getText().toString();
            Integer v=Integer.parseInt(s);
            double ans=v*1000;
            text.setText("Converted kilogram to gram:- "+ans);
        }
        else if(a==4)
        {
            String s=editext.getText().toString();
            Double v=Double.parseDouble(s);
            double ans=v/1000;
            text.setText("Converted gram to kilogram:- "+ans);
        }
    }
    public int kgtog(View view)
    {
        a=3;
        return a;
    }
    public int gtokg(View view)
    {
        a=4;
        return a;
    }

    public int cmtom(View view)
{
    a=1;
    return a;
}
    public int mtocm(View view)
    {
        a=2;
        return a;
    }

}