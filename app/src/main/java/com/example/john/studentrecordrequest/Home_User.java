package com.example.john.studentrecordrequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__user);

        //start here

        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final TextView display1 = (TextView) findViewById(R.id.display);

        Intent intent = getIntent();
        String firstname = intent.getStringExtra("firstname");
        String middlename = intent.getStringExtra("middlename");
        String lastname = intent.getStringExtra("lastname");
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        String email = intent.getStringExtra("email");
        String status = intent.getStringExtra("status");
        String account = intent.getStringExtra("account");

        String user = firstname + " " + middlename + " " + lastname + " " + "(" + status + ")";
        display1.setText(user);


        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent FormIntent = new Intent(Home_User.this, RequestForm.class);
                Home_User.this.startActivity(FormIntent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent NotifIntent = new Intent(Home_User.this, Notif_User.class);
                Home_User.this.startActivity(NotifIntent);
            }
        });  button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent DocIntent = new Intent(Home_User.this, List_User.class);
                Home_User.this.startActivity(DocIntent);
            }
        });  button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent SetIntent = new Intent(Home_User.this, User_Settings.class);
                Home_User.this.startActivity(SetIntent);
            }
        });  button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent BackIntent = new Intent(Home_User.this, LogIn.class);
                Home_User.this.startActivity(BackIntent);
            }
        });
    }
}
