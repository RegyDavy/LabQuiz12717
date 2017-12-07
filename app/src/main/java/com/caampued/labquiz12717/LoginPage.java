package com.caampued.labquiz12717;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText UserName, Password;
    Button SaveInfo, Login;
    SharedPreferences.Editor editor;
    SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        UserName = (EditText) findViewById(R.id.UserName);
        Password = (EditText) findViewById(R.id.Password);
        SaveInfo = (Button) findViewById(R.id.SaveInfo);
        Login = (Button) findViewById(R.id.Login);
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(" ", MODE_PRIVATE);
        editor = preferences.edit();



    }

    public void saveUserInfo (View view) {
        editor.putString("username", UserName.getText().toString());
        editor.putString("password", Password.getText().toString());
        editor.commit();
        Toast.makeText(this, "Data Saved!", Toast.LENGTH_SHORT).show();
    }

    public void Landingpage (View view){

        Intent intent = new Intent(this, LandinPage.class);
        startActivity(intent);
        pref = getApplication().getSharedPreferences(" ", MODE_PRIVATE);

        UserName = (EditText) findViewById(R.id.UserName);









    }

}
