package com.ceyon.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button button;
    public static final String MYPREFERNCE="mypreference";
    public static final String Name= "nameKey";
    public static final String Email = "emailKey";

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.name);
        editText2 = (EditText)findViewById(R.id.email);
        button = (Button)findViewById(R.id.save);
        sharedPreferences = getSharedPreferences(MYPREFERNCE, Context.MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  name = editText1.getText().toString();
                String  email = editText2.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Name,name);
                editor.putString(Email,email);
                editor.commit();
                Toast.makeText(MainActivity.this,"please wait...",Toast.LENGTH_LONG).show();






            }
        });



    }
}
