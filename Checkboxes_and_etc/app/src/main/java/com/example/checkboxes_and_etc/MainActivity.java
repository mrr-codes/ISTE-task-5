package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.time.ZoneOffset;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    public void onChecked(View view) {//is button now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.brownie_check:
                if (checked)
                // Same day service
                displayToast(getString(R.string.brownie_text));

            case R.id.sprinkles_check:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.sprinkles_text));
                break;
            case R.id.cookies_check:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.cookies_text));
                break;
            default:
                // Do nothing.
                break;
        }

    }

    public void onButton(View view) {

    }
}
