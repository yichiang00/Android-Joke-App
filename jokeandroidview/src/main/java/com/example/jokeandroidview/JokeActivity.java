package com.example.jokeandroidview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
Step 2: Create an Android Library
Create an Android Library containing an Activity that will display a joke passed to it as an intent extra. Wire up project dependencies so that the button can now pass the joke from the Java Library to the Android Library.

For review on how to create an Android library, check out demo 4.03. For a refresher on intent extras, check out;

http://developer.android.com/guide/components/intents-filters.html

In both modules you have an activity_main.xml. Please rename one file. I hope it helps you.

https://stackoverflow.com/questions/29440321/nosuchfielderror-no-static-field-listview1-of-type-i-in-class-lcom-disdemo-rid
* */
public class JokeActivity extends AppCompatActivity {

    /*
    example - https://developer.android.com/guide/components/intents-filters
    static final String ACTION_TIMETRAVEL = "com.example.action.TIMETRAVEL";
     */
    public static final String EXTRA_JOKE = "JOKE_INTENT_VALUE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_text_view);

        //get intent -> Set text from extra
        if(getIntent() != null && getIntent().hasExtra(EXTRA_JOKE))
        {
            jokeTextView.setText(getIntent().getStringExtra(EXTRA_JOKE));
        }
    }

//
//    public void displayJoke()
//    {
//        TextView jokeTextView = (TextView) findViewById(R.id.joke_text_view);
//
//        //get intent -> Set text from extra
//        if(getIntent().hasExtra(EXTRA_JOKE))
//        {
//            jokeTextView.setText(getIntent().getStringExtra(EXTRA_JOKE));
//        }
//    }
}
