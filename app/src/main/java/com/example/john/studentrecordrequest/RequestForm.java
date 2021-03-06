package com.example.john.studentrecordrequest;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RequestForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_form);

        final Spinner filename1 = (Spinner) findViewById(R.id.filename);
        final EditText mobile1 = (EditText) findViewById(R.id.mobile);
        final EditText address1 = (EditText) findViewById(R.id.address);
        final Spinner payment1 = (Spinner) findViewById(R.id.payment);
        final Button send = (Button) findViewById(R.id.button17);


        Spinner ss = (Spinner) findViewById(R.id.filename);
        ss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(RequestForm.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        Spinner a = (Spinner) findViewById(R.id.payment);

        a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(RequestForm.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                final String filename = filename1.getSelectedItem().toString();
                final int mobile = Integer.parseInt(mobile1.getText().toString());
                final String address = address1.getText().toString();
                final String payment = payment1.getSelectedItem().toString();




                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {






                                Intent intent = new Intent(RequestForm.this, Home_User.class);




                                RequestForm.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RequestForm.this);
                                builder.setMessage("Sending Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                            }

                };

                SendForm sendform = new SendForm (filename, mobile, address, payment, responseListener);
                RequestQueue queue1 = Volley.newRequestQueue(RequestForm.this);
                queue1.add(sendform);
            }
        });

    }
}
