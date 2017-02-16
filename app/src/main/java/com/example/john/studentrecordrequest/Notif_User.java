package com.example.john.studentrecordrequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Notif_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif__user);

        final TextView reg = (TextView) findViewById(R.id.reg);
        final TextView cash = (TextView) findViewById(R.id.cash);

        reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regIntent = new Intent(Notif_User.this, Home_Registrar.class);
                Notif_User.this.startActivity(regIntent);
            }
        });

        cash.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cashIntent = new Intent(Notif_User.this, Home_Cashier.class);
                Notif_User.this.startActivity(cashIntent);
            }
        });
    }
}
