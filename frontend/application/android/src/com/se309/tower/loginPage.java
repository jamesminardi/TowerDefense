package com.se309.tower;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
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

        final SharedPreferences mPrefs = getSharedPreferences("test",0);
        String usernameSave = mPrefs.getString("username","none");
        String passwordSave = mPrefs.getString("password","none");

        if(!(usernameSave.equals("none") || passwordSave.equals("none"))) {
            username1.setText(usernameSave);
            password1.setText(passwordSave);
            RequestQueue queue = Volley.newRequestQueue(loginPage.this);
            JSONObject data = new JSONObject();
            try {
                data.put("username",usernameSave);
                data.put("password",passwordSave);

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
                    if(res.equals("true")) {
                        password1.setText(res);
                        startActivity(new Intent(loginPage.this, HomePage.class));
                    }
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





        Button page = findViewById(R.id.button2);
        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loginPage.this, createLgoin.class));
            }});

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = username.getText().toString();
                final String pass = password.getText().toString();
                username1.setText(name);
                password1.setText(pass);


                RequestQueue queue = Volley.newRequestQueue(loginPage.this);
                JSONObject data = new JSONObject();
                try {
                    data.put("email",name);
                    data.put("password",pass);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                //String address = "https://56be132c-7751-4deb-99d0-e96db2690a7c.mock.pstmn.io/test";
                // login https://localhost:8080/login
                String address = "http://10.49.41.72:8080/login";
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, address, data, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String res = "";
                        try {
                            res = response.getString("error");
                        } catch (JSONException e) {
                            e.printStackTrace();
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(loginPage.this);
                            alertDialogBuilder.setTitle("Error");
                            alertDialogBuilder.setMessage("Bad USER OR PASS");
                            alertDialogBuilder.setPositiveButton("Ok", null);
                            alertDialogBuilder.setNegativeButton("", null);
                            alertDialogBuilder.create().show();
                        }
                        if(res.equals("true")) {
                            SharedPreferences.Editor mEditor = mPrefs.edit();
                            mEditor.putString("email", name).commit();
                            mEditor.putString("password", pass).commit();
                            password1.setText(res);
                            startActivity(new Intent(loginPage.this, HomePage.class));
                        }
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