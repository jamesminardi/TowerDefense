package com.se309.tower;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);


        TextView Details = findViewById(R.id.ProfileDetails);
        GetProfileDetails(Details);

        Button back = findViewById(R.id.ProfileBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }});

    }

    /**
     * Calls the backend to print all of the user data onto the text view provided
     * @param tV is the text view that will be updated
     * @return
     */
    String GetProfileDetails(final TextView tV){
        final RequestQueue queue = Volley.newRequestQueue(ProfilePage.this);
        final String[] result = {""};
        String friendaddress =  "http://coms-309-027.class.las.iastate.edu:8080/user";
        JsonObjectRequest FriendList = new JsonObjectRequest(Request.Method.GET, friendaddress, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("Response: " , response.toString());
                try {
                    JSONObject data = response.getJSONObject("data");
                     data = data.getJSONObject("user");

                    result[0] +="Username: " + data.getString("username") + "\n";
                    result[0] +="Email: " + data.getString("email") + "\n";
                    result[0] +="Role: " + data.getString("role") + "\n";
                    tV.setText(result[0]);

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(FriendList);
        try{Thread.sleep( 1000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        String friendaddress2 =  "http://coms-309-027.class.las.iastate.edu:8080/user/stats";
        JsonObjectRequest FriendList2 = new JsonObjectRequest(Request.Method.GET, friendaddress2, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("Response: " , response.toString());
                try {
                    JSONObject data = response.getJSONObject("data");


                    result[0] +="Level: " + data.getString("level") + "\n";
                    result[0] +="Experience: " + data.getString("experience") + "\n";
                    result[0] +="Kills: " + data.getString("kills") + "\n";
                    result[0] +="Wins: " + data.getString("wins") + "\n";
                    result[0] +="Losses: " + data.getString("losses") + "\n";
                    tV.setText(result[0]);

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(FriendList2);




        Log.i("Response: " , result[0]);
        return result[0];
    }



}