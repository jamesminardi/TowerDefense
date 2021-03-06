package com.se309.tower;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SocialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        final RequestQueue queue = Volley.newRequestQueue(SocialPage.this);
        final SharedPreferences mPrefs = getSharedPreferences("test",0);


        Button recentPlayer = findViewById(R.id.RecentPlayers);
        recentPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                alertDialogBuilder.setTitle("Feature Coming Soon!");
                alertDialogBuilder.setMessage("");
                alertDialogBuilder.setPositiveButton("Ok", null);
                alertDialogBuilder.setNegativeButton("", null);
                alertDialogBuilder.create().show();

            }
        });

        Button back = findViewById(R.id.backSocial);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }});
        Button Leaderboards = findViewById(R.id.Leaderboards);
        Leaderboards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SocialPage.this, LeaderboardsPage.class));

            }});


        Button addFriend = findViewById(R.id.addFriendButton);
        final EditText addFriendText = findViewById(R.id.addFriendText);

        addFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String friendUsername = addFriendText.getText().toString();
                String usernameSave = mPrefs.getString("username","none");
                String friendrequestaddress =  "http://coms-309-027.class.las.iastate.edu:8080/user/friends/add?user=" + friendUsername;
                //call add friend command
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, friendrequestaddress, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject res = null;
                        Log.i("Response: " , response.toString());
                        try {
                            res = response.getJSONObject("data");
                            if (res == null){
                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                                alertDialogBuilder.setTitle("Error");
                                alertDialogBuilder.setMessage("Invalid username");
                                alertDialogBuilder.setPositiveButton("Ok", null);
                                alertDialogBuilder.setNegativeButton("", null);
                                alertDialogBuilder.create().show();
                            }
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                            alertDialogBuilder.setTitle("sentRequest");
                            alertDialogBuilder.setMessage("");
                            alertDialogBuilder.setPositiveButton("Ok", null);
                            alertDialogBuilder.setNegativeButton("", null);
                            alertDialogBuilder.create().show();

                        } catch (JSONException e) {

                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                        alertDialogBuilder.setTitle("Error");
                        alertDialogBuilder.setMessage(error.getMessage());
                        alertDialogBuilder.setPositiveButton("Ok", null);
                        alertDialogBuilder.setNegativeButton("", null);
                        alertDialogBuilder.create().show();
                    }
                });
                queue.add(request);
            }});










        friendlayout();


        String friendRequestaddress =  "http://coms-309-027.class.las.iastate.edu:8080/user/friends/received";
        JsonObjectRequest RequestList = new JsonObjectRequest(Request.Method.GET, friendRequestaddress, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("Response: " , response.toString());
                JSONArray res = null;
                try {
                    res = response.getJSONArray("data");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < res.length(); i++) {
                    try {
                        friendRequest(res.getJSONObject(i));
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(RequestList);

    }

    /**
     * takes the json info and addes it to friendList layout
     * @param friend
     */
    public void friend(JSONObject friend){
        final RequestQueue queue = Volley.newRequestQueue(SocialPage.this);
        ViewGroup layout = (ViewGroup) findViewById(R.id.friendList);
        Toolbar.LayoutParams lparams = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
        final LinearLayout hort = new LinearLayout(this);
        hort.setOrientation(LinearLayout.HORIZONTAL);
        String username = "";
        TextView cur = new TextView(this);
        cur.setLayoutParams(lparams);
        try {
            cur.setText(username=friend.getString("username"));
        } catch (Exception e){
            e.printStackTrace();
        }
        Typeface typeface = getResources().getFont(R.font.roboto);
        cur.setTypeface(typeface);

        final Button decline = new Button(this);
        decline.setBackgroundColor(0x5AA7F0);

        decline.setText("Remove Friend");
        final String finalUsername = username;
        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String friendrequestaddress =  "http://coms-309-027.class.las.iastate.edu:8080/user/friends/remove?user=" + finalUsername;
                //call add friend command
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, friendrequestaddress, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject res = null;
                        try {
                            res = response.getJSONObject("data");
                            if (res == null){
                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                                alertDialogBuilder.setTitle("Error");
                                alertDialogBuilder.setMessage("Invalid username");
                                alertDialogBuilder.setPositiveButton("Ok", null);
                                alertDialogBuilder.setNegativeButton("", null);
                                alertDialogBuilder.create().show();
                            }
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                            alertDialogBuilder.setTitle("removed User");
                            alertDialogBuilder.setMessage("");
                            alertDialogBuilder.setPositiveButton("Ok", null);
                            alertDialogBuilder.setNegativeButton("", null);
                            alertDialogBuilder.create().show();
                            friendlayout();

                        } catch (JSONException e) {

                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                        alertDialogBuilder.setTitle("Error");
                        alertDialogBuilder.setMessage(error.getMessage());
                        alertDialogBuilder.setPositiveButton("Ok", null);
                        alertDialogBuilder.setNegativeButton("", null);
                        alertDialogBuilder.create().show();
                    }
                });
                queue.add(request);

            }});
        hort.addView(cur);
        hort.addView(decline);
        layout.addView(hort);

    }

    /**
     * takes the json info and addes it to friendRequest layout
     * @param friend
     */
    private void friendRequest(JSONObject friend){
        final RequestQueue queue = Volley.newRequestQueue(SocialPage.this);

        String username = "";
        final ViewGroup layout = (ViewGroup) findViewById(R.id.friendRequest);
        Toolbar.LayoutParams lparams = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);

        final LinearLayout hort = new LinearLayout(this);
        hort.setOrientation(LinearLayout.HORIZONTAL);


        final TextView cur = new TextView(this);
        cur.setLayoutParams(lparams);
        try {
            JSONObject temp = friend.getJSONObject("sender");
            username = temp.getString("username");
            cur.setText(username);

        } catch (Exception e){
            e.printStackTrace();
        }
        final Button accept = new Button(this);
        final Button decline = new Button(this);
        accept.setBackgroundColor(0x5AA7F0);
        decline.setBackgroundColor(0x5AA7F0);



        accept.setText("accept");
        final String finalUsername = username;
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String friendrequestaddress =  "http://coms-309-027.class.las.iastate.edu:8080/user/friends/accept?user=" + finalUsername;
                //call add friend command
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, friendrequestaddress, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject res = null;
                        try {
                            res = response.getJSONObject("data");
                            if (res == null){
                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                                alertDialogBuilder.setTitle("Error");
                                alertDialogBuilder.setMessage("Invalid username");
                                alertDialogBuilder.setPositiveButton("Ok", null);
                                alertDialogBuilder.setNegativeButton("", null);
                                alertDialogBuilder.create().show();
                            }
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                            alertDialogBuilder.setTitle("Added User");
                            alertDialogBuilder.setMessage("");
                            alertDialogBuilder.setPositiveButton("Ok", null);
                            alertDialogBuilder.setNegativeButton("", null);
                            alertDialogBuilder.create().show();
                            friendlayout();
                            hort.removeView(decline);
                            hort.removeView(accept);
                            hort.removeView(cur);

                        } catch (JSONException e) {

                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                        alertDialogBuilder.setTitle("Error");
                        alertDialogBuilder.setMessage(error.getMessage());
                        alertDialogBuilder.setPositiveButton("Ok", null);
                        alertDialogBuilder.setNegativeButton("", null);
                        alertDialogBuilder.create().show();
                    }
                });
                queue.add(request);

            }});






        decline.setText("decline");
        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String friendrequestaddress =  "http://coms-309-027.class.las.iastate.edu:8080/user/friends/decline?user=" + finalUsername;
                //call add friend command
                JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, friendrequestaddress, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject res = null;
                        try {
                            res = response.getJSONObject("data");
                            if (res == null){
                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                                alertDialogBuilder.setTitle("Error");
                                alertDialogBuilder.setMessage("Invalid username");
                                alertDialogBuilder.setPositiveButton("Ok", null);
                                alertDialogBuilder.setNegativeButton("", null);
                                alertDialogBuilder.create().show();
                            }
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                            alertDialogBuilder.setTitle("Declined User");
                            alertDialogBuilder.setMessage("");
                            alertDialogBuilder.setPositiveButton("Ok", null);
                            alertDialogBuilder.setNegativeButton("", null);
                            alertDialogBuilder.create().show();
                            hort.removeView(decline);
                            hort.removeView(accept);
                            hort.removeView(cur);

                        } catch (JSONException e) {

                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SocialPage.this);
                        alertDialogBuilder.setTitle("Error");
                        alertDialogBuilder.setMessage(error.getMessage());
                        alertDialogBuilder.setPositiveButton("Ok", null);
                        alertDialogBuilder.setNegativeButton("", null);
                        alertDialogBuilder.create().show();
                    }
                });
                queue.add(request);

            }});




        hort.addView(cur);
        hort.addView(accept);
        hort.addView(decline);


        layout.addView(hort);

    }
    void friendlayout(){
        final RequestQueue queue = Volley.newRequestQueue(SocialPage.this);
        ViewGroup layout = (ViewGroup) findViewById(R.id.friendList);
        layout.removeAllViews();
        TextView title = new TextView(this);
        title.setText("Friends List");
        Typeface typeface = getResources().getFont(R.font.roboto);
        title.setTypeface(typeface);
        layout.addView(title);

        String friendaddress = "http://coms-309-027.class.las.iastate.edu:8080/user/friends";
        JsonObjectRequest FriendList = new JsonObjectRequest(Request.Method.GET, friendaddress, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("Response: ", response.toString());
                JSONArray res = null;
                try {
                    res = response.getJSONArray("data");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < res.length(); i++) {
                    try {
                        friend(res.getJSONObject(i));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(FriendList);
    }
}