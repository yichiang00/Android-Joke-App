package com.udacity.gradle.builditbigger;
import com.udacity.gradle.builditbigger.MainActivity;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.app.FragmentManager;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class MainActivityBasicTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    @Before
    public void setup() {

    }
    @Test
    public void checkAsyncTask() {
        JokeAsyncTask asyncTask = new JokeAsyncTask(){
            @Override
            protected void onPostExecute(String result)
            {
                assertFalse(result.contains("Failed to"));

            }
        };
        asyncTask.execute(mActivityTestRule.getActivity());

    }

}