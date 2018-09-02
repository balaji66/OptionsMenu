package com.durga.balaji66.optionsmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.settings:
                Toast.makeText(getApplicationContext(),"You clicked settings ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.about:
                Toast.makeText(getApplicationContext(),"You clicked about ",Toast.LENGTH_LONG).show();


                break;
            case R.id.contacts:
                Toast.makeText(getApplicationContext(),"You clicked contacts ",Toast.LENGTH_LONG).show();

                break;
            case R.id.logout:
                finishAffinity();
                Toast.makeText(getApplicationContext(),"You clicked logout ",Toast.LENGTH_LONG).show();

                break;
        }

        return true;
    }
}
