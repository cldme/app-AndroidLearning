package com.example.cldme.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button answerYesButton, answerNoButton;
    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerYesButton = (Button) findViewById(R.id.answerYes);

        answerNoButton = (Button) findViewById(R.id.answerNo);

        userName = (EditText) findViewById(R.id.userName);
    }

    public void onYesButtonClick(View view) {

        String userNameText = String.valueOf(userName.getText());

        String response = "That is great " + userNameText;

        Toast.makeText(this, response, Toast.LENGTH_LONG).show();

    }

    public void onNoButtonClick(View view) {

        String userNameText = String.valueOf(userName.getText());

        String response = "To bad, unlucky, " + userNameText;

        Toast.makeText(this, response, Toast.LENGTH_LONG).show();

    }
}
