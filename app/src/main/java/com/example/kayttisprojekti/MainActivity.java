package com.example.kayttisprojekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView txtUserCounter = findViewById(R.id.txtUserCounter); //--------------
        //txtUserCounter.setText( "Käyttäjiä on " + User.userCounter);  //-------------

    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, InformationActivity.class );
        startActivity(intent);
    }

    public void switchToListUsers(View view) {
        Intent intent = new Intent(this, ListUsersActivity.class );
        startActivity(intent);
    }

}