package com.nitish.grocerhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.tapadoo.alerter.Alerter;

public class BookSlot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_slot);

        findViewById(R.id.update_details).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AvailabilityForm.class));
            }
        });

        findViewById(R.id.confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(BookSlot.this)
                        .setTitle("Your slot is booked")
                        .setText("You will be informed once the time arrives")
                        .setBackgroundColorInt(Color.parseColor("#21A87D"))
                        .setDuration(10000)
                        .show();
            }
        });

    }
}
