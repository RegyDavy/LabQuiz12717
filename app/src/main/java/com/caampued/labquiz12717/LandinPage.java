package com.caampued.labquiz12717;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LandinPage extends AppCompatActivity {
    TextView PreviewUser;
    Button  BacktoLogin;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landin_page);
        PreviewUser = (TextView) findViewById(R.id.PreviewUser);
        BacktoLogin = (Button) findViewById(R.id.BacktoLogin);
        pref = getApplication().getSharedPreferences(" ", MODE_PRIVATE);

        String user = pref.getString("username", "");


        PreviewUser.setText(user);

    }



    public void GotoLogin (View view){
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
