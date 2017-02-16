package com.example.john.studentrecordrequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home_Cashier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__cashier);

        //start here

        final Button button13 = (Button) findViewById(R.id.button13);
        final Button button14 = (Button) findViewById(R.id.button14);
        final Button button15 = (Button) findViewById(R.id.button15);
        final Button button16 = (Button) findViewById(R.id.button16);
        final TextView display2 = (TextView) findViewById(R.id.textView5);

        Intent intent = getIntent();
        String firstname = intent.getStringExtra("firstname");
        String middlename = intent.getStringExtra("middlename");
        String lastname = intent.getStringExtra("lastname");
        String account = intent.getStringExtra("account");

        String cashier = firstname + " " + middlename + " " + lastname + " " + "(" + account + ")";
        display2.setText(cashier);


        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Notif2Intent = new Intent(Home_Cashier.this, Notif_Cashier.class);
                Home_Cashier.this.startActivity(Notif2Intent);
            }
        });
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent PayIntent = new Intent(Home_Cashier.this, Payment_Cashier.class);
                Home_Cashier.this.startActivity(PayIntent);
            }
        });  button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Set2Intent = new Intent(Home_Cashier.this, Settings_Cashier.class);
                Home_Cashier.this.startActivity(Set2Intent);
            }
        });  button16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Back2Intent = new Intent(Home_Cashier.this, LogIn.class);
                Home_Cashier.this.startActivity(Back2Intent);
            }
        });
    }
}
