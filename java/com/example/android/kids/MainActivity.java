package com.example.android.kids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }
         public void openNumbersList(View view) {
             Intent i = new Intent(this, NumbersActivity.class);
                  startActivity(i);
            }
         public void openFamilyList(View view) {
              Intent i = new Intent(this, FamilyActivity.class);
                   startActivity(i);
    }
          public void openColorsList(View view) {
               Intent i = new Intent(this, ColorsActivity.class);
                startActivity(i);
    }
           public void openPhrasesList(View view) {
                Intent i = new Intent(this, PhrasesActivity.class);
                  startActivity(i);
    }

}

