package com.example.kayttisprojekti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private String degree; //---------------?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        firstName = findViewById(R.id.txtFirstName);
        lastName = findViewById(R.id.txtLastName);
        email = findViewById(R.id.txtEmailaddress);
    }

    public void addUser(View view) {
        RadioGroup rgpDegreeType = findViewById(R.id.rgpDegreeType);


        switch (rgpDegreeType.getCheckedRadioButtonId()) {
            case R.id.rbTite:
                degree = "Tietotekniikka";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degree));
                break;
            case R.id.rbTuta:
                degree = "Tuotantotalous";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degree));
                break;
            case R.id.rbLate:
                degree = "Laskennallinen tekniikka";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degree));
                break;
            case R.id.rbSate:
                degree = "Sähkötekniikka";
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degree));
                break;
        }
    }
}