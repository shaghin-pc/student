package com.shagi.studentd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button b1,b2;
    String name,ad_no,roll_no,college;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.e1);
        ed2=(EditText)findViewById(R.id.e2);
        ed3=(EditText)findViewById(R.id.e3);
        ed4=(EditText)findViewById(R.id.e4);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"kooih",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getApplicationContext(),register.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=ed1.getText().toString();
                ad_no=ed2.getText().toString();
                roll_no=ed3.getText().toString();
                college=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),name+"adaa",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),ad_no+"",Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),roll_no,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),college,Toast.LENGTH_LONG).show();

                Log.d("name",name);
                Log.d("admission",ad_no);
                Log.d("roll",roll_no);
                Log.d("clg",college);
                if(name.equals("admin")&&ad_no.equals("12345")&&roll_no.equals("12")&&college.equals("mg"))
                {
                    Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"faild",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
