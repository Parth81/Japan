package com.example.nyuscps.japan;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        /*Window window = getWindow();
        if (Build.VERSION.SDK_INT < 16) {
            //Hide the status bar.
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

            //Hide the action bar (used to be called the title bar).
            requestWindowFeature(Window.FEATURE_NO_TITLE);
        } else {
            //Hide the status bar.  Requires at least
            //minSdkVersion 16 in Gradle Scripts -> build.gradle (app).
            //import android.app.ActionBar;
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

            //Hide the action bar.
            android.support.v7.app.ActionBar actionBar = getSupportActionBar();
            //ActionBar actionBar = getActionBar();
            //if (actionBar != null)
            actionBar.hide();
            //getSupportActionBar().hide();
        }
        */

        String s = "SDK: " + Build.VERSION.SDK_INT;
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();

        JapanView japanView = new JapanView(this);
        setContentView(japanView);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Window window = getWindow();
        if (Build.VERSION.SDK_INT < 16) {
            //Hide the status bar.
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

            //Hide the action bar (used to be called the title bar).
            //requestWindowFeature(Window.FEATURE_NO_TITLE);
        } else {
            //Hide the status bar.  Requires at least
            //minSdkVersion 16 in Gradle Scripts -> build.gradle (app).
            //import android.app.ActionBar;
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

            //Hide the action bar.
            android.support.v7.app.ActionBar actionBar = getSupportActionBar();
            //ActionBar actionBar = getActionBar();
            //if (actionBar != null)
            actionBar.hide();
            //getSupportActionBar().hide();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
