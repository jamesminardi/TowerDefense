package com.se309.tower;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        final EditText username = findViewById(R.id.editTextTextPersonName);
        final EditText password = findViewById(R.id.editTextTextPassword);
        final TextView username1 = findViewById(R.id.textView);
        final TextView password1 = findViewById(R.id.textView2);
        Button submit = findViewById(R.id.button);

        Button page = findViewById(R.id.button2);
        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loginPage.this, loginPage.class));
            }});

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                username1.setText(name);
                password1.setText(pass);


                RequestQueue queue = Volley.newRequestQueue(loginPage.this);
                JSONObject data = new JSONObject();
                try {
                    data.put("username",name);
                    data.put("passphrase",pass);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                String address = "https://56be132c-7751-4deb-99d0-e96db2690a7c.mock.pstmn.io/test";
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, address, data, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String res = "";
                        try {
                            res = response.getString("response");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        password1.setText(res);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(loginPage.this);
                        alertDialogBuilder.setTitle("Error");
                        alertDialogBuilder.setMessage(error.getMessage());
                        alertDialogBuilder.setPositiveButton("Ok", null);
                        alertDialogBuilder.setNegativeButton("", null);
                        alertDialogBuilder.create().show();
                    }
                });
                queue.add(request);



            }



        });



    }
}