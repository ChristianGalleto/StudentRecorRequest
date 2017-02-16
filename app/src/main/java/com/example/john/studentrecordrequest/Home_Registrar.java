package com.example.john.studentrecordrequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home_Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__registrar);


        //start here

        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button button11 = (Button) findViewById(R.id.button11);
        final Button button12 = (Button) findViewById(R.id.button12);
        final TextView display3 = (TextView) findViewById(R.id.textView4);

        Intent intent = getIntent();
        String firstname = intent.getStringExtra("firstname");
        String middlename = intent.getStringExtra("middlename");
        String lastname = intent.getStringExtra("lastname");
        String account = intent.getStringExtra("account");

        String registrar = firstname + " " + middlename + " " + lastname + " " + "(" + account + ")";
        display3.setText(registrar);



        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Notif1Intent = new Intent(Home_Registrar.this, Notif_Registrar.class);
                Home_Registrar.this.startActivity(Notif1Intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent RequestListIntent = new Intent(Home_Registrar.this, RequestList_Registrar.class);
                Home_Registrar.this.startActivity(RequestListIntent);
            }
        });  button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent AddIntent = new Intent(Home_Registrar.this, AddUser_Registrar.class);
                Home_Registrar.this.startActivity(AddIntent);
            }
        });  button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Set1Intent = new Intent(Home_Registrar.this, Settings_Registrar.class);
                Home_Registrar.this.startActivity(Set1Intent);
            }
        });  button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Back1Intent = new Intent(Home_Registrar.this, LogIn.class);
                Home_Registrar.this.startActivity(Back1Intent);
            }
        });
    }
}
